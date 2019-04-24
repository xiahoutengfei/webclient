package com.xhtf.backstage.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.xhtf.backstage.controller"})
public class App {
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
	
}

