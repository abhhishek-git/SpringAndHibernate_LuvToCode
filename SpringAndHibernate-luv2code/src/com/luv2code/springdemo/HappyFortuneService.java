package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//adding @Component annotation , so that Spring can register it
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
