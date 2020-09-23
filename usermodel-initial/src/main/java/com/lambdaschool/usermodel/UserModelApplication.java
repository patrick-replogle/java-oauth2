package com.lambdaschool.usermodel;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main class to start the application.
 */
@EnableJpaAuditing
@SpringBootApplication
public class UserModelApplication
{
    /**
     * Main method to start the application.
     *
     * @param args Not used in this application.
     */

    public static void main(String[] args)
    {

        SpringApplication.run(UserModelApplication.class,
                              args);
        System.out.println(System.getenv("OAUTHCLIENTSECRET"));
        System.out.println(System.getenv("OAUTHCLIENTID"));
        System.out.println("hello");
    }
}
