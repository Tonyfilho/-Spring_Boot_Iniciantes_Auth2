package spring.com.spring_iniciantes.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;

@Configuration // Tem que ser um tipo de class do spring de configuração
@EnableWebSecurity // esta é a anotação para configuração de segurança
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.cors()
        .and()
        .authorizeRequests()
        .antMatchers(HttpMethod.GET, "/")
        .hasAuthority("User")
        .anyRequest()
        .authenticated()
        .and()
        .oauth2ResourceServer()
        .jwt()
        .jwtAuthenticationConverter(getjwtAuthenticationConverter());
        
    }

    // este Metodo EDITA a opção default do JwaAuthentication , desta forma teremos acesso a uma Var chamada authorities

    JwtAuthenticationConverter getjwtAuthenticationConverter() {
        JwtGrantedAuthoritiesConverter converter = new JwtGrantedAuthoritiesConverter();
        converter.setAuthoritiesClaimName("authorities");
        converter.setAuthorityPrefix("");
        JwtAuthenticationConverter authenticationConverter = new JwtAuthenticationConverter();
        authenticationConverter.setJwtGrantedAuthoritiesConverter(converter);
        return authenticationConverter;
    }
    
}// end class