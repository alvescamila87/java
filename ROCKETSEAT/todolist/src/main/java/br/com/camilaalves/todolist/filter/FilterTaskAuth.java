package br.com.camilaalves.todolist.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        //Pegar a autenticação (usuário e senha)
        var authorization = request.getHeader("Authorization");

        var user_password = authorization.substring("Basic".length()).trim();
        System.out.println("Authorization");
        System.out.println(user_password);


        // Validar usuário

        // Validar senha

        // Rota happy flow


    }
}

