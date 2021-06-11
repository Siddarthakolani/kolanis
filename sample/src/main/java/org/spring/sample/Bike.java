package org.spring.sample;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechile{
	public void drive() {
		System.out.println("drive the bike");
	}
}
