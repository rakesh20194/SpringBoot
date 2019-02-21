package com.practice.SpringBoot;

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

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "Welcome to my world!!!!";
    }
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
    public String persistPerson(@RequestBody User user) {
        return "Hello\t"+user.getFirstName()+" "+user.getMiddleName()+" "+user.getLastName();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}
