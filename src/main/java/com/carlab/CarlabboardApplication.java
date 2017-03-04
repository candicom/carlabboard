package com.carlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Jack Kim on 2017-03-03.
 */


@SpringBootApplication
public class CarlabboardApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CarlabboardApplication.class);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(CarlabboardApplication.class, args);
    }

}


//@SpringBootApplication
//public class CarlabboardApplication {
//
//	public static void main(String[] args) {
//
//	    SpringApplication.run(CarlabboardApplication.class, args);
//	}
//}
