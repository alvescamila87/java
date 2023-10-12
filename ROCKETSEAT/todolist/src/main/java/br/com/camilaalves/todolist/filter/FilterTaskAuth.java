package br.com.camilaalves.todolist.filter;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.camilaalves.todolist.user.IUserRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Base64;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Autowired
    private IUserRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        var servletPath = request.getServletPath();
        System.out.println("PATH " + servletPath);
        if (servletPath.startsWith("/tasks/")) {

            //Pegar a autenticação (usuário e senha)
            var authorization = request.getHeader("Authorization");

            var authEncoded = authorization.substring("Basic".length()).trim();

            byte[] authDecoded= Base64.getDecoder().decode(authEncoded);

            var authString = new String(authDecoded);
            System.out.println("Authorization");
            System.out.println(authString);

            //["silvajoao", "123456"]
            String[] credencials = authString.split(":");
            String username = credencials[0];
            String password = credencials[1];
            System.out.println("Credencials");
            System.out.println(username);
            System.out.println(password);

            // Validar usuário
            var user = this.userRepository.findByUsername(username);

            if(user == null) {
                response.sendError(401);
            } else {

                // Validar senha
                var passwordVerify = BCrypt.verifyer().verify(password.toCharArray(), user.getPassword());

                if (passwordVerify.verified) {
                    // Rota happy flow
                    request.setAttribute("idUser", user.getId());
                    filterChain.doFilter(request, response);
                } else {
                    response.sendError(401);
                }
            }
        } else {
            filterChain.doFilter(request, response);
        }
    }
}

