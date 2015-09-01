package com.wozniczka.tomasz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by tomek on 16.08.15.
 */
//@Component
public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

		Car car = context.getBean(Car.class);
		car.printer();
	}
}
