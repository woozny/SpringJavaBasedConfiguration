package com.wozniczka.tomasz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

/**
 * Created by tomek on 16.08.15.
 */
//@ComponentScan
//@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	@Scope("singleton")
	public Car car() {
		return new Car(new Route());
	}

	@Bean
	@Scope("singleton")
	public Route route() {
		return new Route();
	}
}
