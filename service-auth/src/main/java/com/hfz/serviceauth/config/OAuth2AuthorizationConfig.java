package com.hfz.serviceauth.config;

import com.hfz.serviceauth.service.security.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * @author youjin
 * @Description:
 * @date 2018-06-07-15:09
 */
//@Configuration
//@EnableAuthorizationServer
//public class OAuth2AuthorizationConfig extends AuthorizationServerConfigurerAdapter {
//
//    @Autowired
//    @Qualifier("dataSource")
//    private DataSource dataSource;
//
//
//    JdbcTokenStore tokenStore=new JdbcTokenStore(dataSource);
//
//    @Autowired
//    @Qualifier("authenticationManagerBean")
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UserServiceDetail userServiceDetail;
//
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//
//        //客户端信息保存在内存中
//        clients.inMemory()
//                .withClient("browser")
//                .authorizedGrantTypes("refresh_token", "password")
//                .scopes("ui")
//                .and()
//                .withClient("service-hi")
//                .secret("123456")
//                .authorizedGrantTypes("client_credentials", "refresh_token","password")
//                .scopes("server");
//
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        endpoints
//                .tokenStore(tokenStore)
//                .authenticationManager(authenticationManager) //配置了才会开启密码类型的验证
//                .userDetailsService(userServiceDetail);
//    }
//
//    @Override
//    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
//        oauthServer
//                .tokenKeyAccess("permitAll()")
//                .checkTokenAccess("isAuthenticated()");
//
//    }
//
//}
