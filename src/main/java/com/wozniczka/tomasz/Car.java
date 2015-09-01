package com.wozniczka.tomasz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tomek on 16.08.15.
 */

public class Car {
	//@Autowired
	private Route route;


	public Car(Route route) {
		this.route = route;
	}

	public void printer() {
		System.out.println("I am Car");
		route.printer();
	}
}
