package org.spring.sample;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand;
 
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	@Override
	public String toString() {
		return "its working";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
