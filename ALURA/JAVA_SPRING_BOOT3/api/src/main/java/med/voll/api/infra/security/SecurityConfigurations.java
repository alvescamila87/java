package med.voll.api.infra.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfigurations {
    @Autowired
    private SecurityFilter securityFilter;
//    A partir da versão 3.1 do Spring Boot algumas mudanças foram realizadas, em relação às
//    configurações de segurança. Caso você esteja utilizando o Spring Boot nessa versão, ou em
//    versões posteriores, o código demonstrado no vídeo anterior vai apresentar um aviso de
//    deprecated, por conta de tais mudanças.

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.csrf().disable()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and().build();
//    A partir dessa versão, o método securityFilterChain deve ser alterado para: V1
//    Entretanto, desde a versão 3.0.0 final do Spring Boot o método authorizeRequests() se tornou
//    deprecated, devendo ser substituído pelo novo método authorizeHttpRequests(). Da mesma forma,
//    o método antMatchers() deve ser substituído pelo novo método requestMatchers():
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.csrf(csrf -> csrf.disable())
//                .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .build();
//    }
//    A partir dessa versão, o método securityFilterChain deve ser alterado para: V2
//@Bean
//public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    return http.csrf().disable()
//            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//            .and().authorizeHttpRequests()
//            .requestMatchers(HttpMethod.POST, "/login").permitAll()
//            .anyRequest().authenticated()
//            .and().addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
//            .build();
//}
// A partir da versão 3.1 do Spring Boot algumas mudanças foram realizadas, em relação às configurações de segurança.
// Caso você esteja utilizando o Spring Boot nessa versão, ou em versões posteriores, o código demonstrado no vídeo anterior vai
// apresentar um aviso de deprecated, por conta de tais mudanças.
// A partir dessa versão, o método securityFilterChain deve ser alterado para: V3

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrf -> csrf.disable())
                .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(req -> {
                    req.requestMatchers(HttpMethod.POST, "/login").permitAll();
                    req.anyRequest().authenticated();
                })
                .addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception{
        return configuration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}


