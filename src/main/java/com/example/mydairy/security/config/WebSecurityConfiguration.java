package com.example.mydairy.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
* 보안설정 Class
* */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            //Security Context 사용
            .securityContext().and()
                //Servlet API 사용
                .servletApi().and()
                //HTTP BASIC 인증 비활성
                .httpBasic().disable()
                //Cross Site Request Forgery 를 비활성화
                .csrf().disable()
                .headers()
                    //X-Frame-Options: 같은 도메인망 허용
                    .frameOptions().sameOrigin()
                    //Strict Transport-Security: HTTP Strict Transport Security (HSTS): 전송계층보안은 서브도메인을 포함하여 허용
                    .httpStrictTransportSecurity().includeSubDomains(true).and()
                    .cacheControl().and()
                    .xssProtection().block(true).and()
                    .and()
                //요청 접근제어
                .authorizeRequests()
                    //.accessDecisionManager(webAc)
                    //모두 접근허용
                    .antMatchers("/images/**").permitAll()
                    //이외 나머지 모드 요청은 로그인 필요
                    .anyRequest().authenticated().and()
                //Form 기반 로그인 설정
                .formLogin()
                    .loginPage("/login")
                    .loginProcessingUrl("/login")
                    //.failureHandler(authenticationManager())
                    //.successHandler()
                   ;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("foo").password("{noop}bar").roles("USER");
    }
}
