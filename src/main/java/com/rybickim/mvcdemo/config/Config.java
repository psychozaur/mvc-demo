package com.rybickim.mvcdemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Config {

    private static final Logger logger = LoggerFactory.getLogger(Config.class);

    private String companyName;
    private String login;
    private String pass;

    public String getLogin() {
        return login;
    }

    @Autowired
    public void setLogin(@Value("${my-login:no-value}") String login) {
        logger.debug("login from config: [{}]", login);
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    @Autowired
    public void setPass(@Value("${my-password:no-value}") String pass) {
        logger.trace("password from config: [{}]", pass);
        this.pass = pass;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Autowired
    public void setCompanyName(@Value("${mycompany-name:no-value}") String companyName) {
        logger.debug("company name from config: [{}]", companyName);
        this.companyName = companyName;
    }
}
