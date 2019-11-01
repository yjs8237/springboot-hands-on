package kr.co.fastcampuse.web.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {
    // TODO SecurityConfig: WebSecurityConfigurerAdapter - configure(WebSecurity web)
    /* TODO configure(HttpSecurity http)
        - formLogin 간단하게 설정, anyRequest authenticated
        - password encorder - PasswordEncoder, NoOpPasswordEncoder, BCryptPasswordEncoder, DelegatingPasswordEncoder
           https://docs.spring.io/spring-security/site/docs/4.2.4.RELEASE/apidocs/org/springframework/security/crypto/password/PasswordEncoder.html
        - 로그아웃 설정
        - formLogin 추가 설정
        - role 적용 - /account, /board
     */
    // TODO filter 동작 설명: FilterChainProxy.getFilters
    // spring security manual : https://docs.spring.io/spring-security/site/docs/5.2.0.RELEASE/reference/htmlsingle/#overall-architecture
    // Authentication Architecture : https://springbootdev.com/2017/08/23/spring-security-authentication-architecture/#more-54
    // spring security filter debugging: https://stackoverflow.com/questions/30855252/how-do-i-enable-logging-for-spring-security/41823422


}

