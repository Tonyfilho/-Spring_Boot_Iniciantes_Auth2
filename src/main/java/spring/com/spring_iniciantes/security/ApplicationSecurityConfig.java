package spring.com.spring_iniciantes.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;

@Configuration // Tem que ser um tipo de class do spring de configuração
@EnableWebSecurity // esta é a anotação para configuração de segurança
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        HttpBasicConfigurer<HttpSecurity> httpBasic = http.authorizeRequests()// Autorizar o Request
                .anyRequest()// Todos Request
                .authenticated() // São Autendicados
                .and() // E autenticados COM??
                .httpBasic(); // HTTP BASIC
    }
}
// end class