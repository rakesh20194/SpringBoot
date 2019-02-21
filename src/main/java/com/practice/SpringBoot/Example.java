package com.practice.SpringBoot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Entity.User;

@RestController
@EnableAutoConfiguration
public class Example {

	
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
    public String persistPerson(@RequestBody User user) {
		System.out.println(user);
        return "Hello\t"+user.getFirstName()+" "+user.getMiddleName()+" "+user.getLastName();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}
