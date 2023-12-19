package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	int age;
	
	Person(@Value(value="21")int age){
		this.age=age;
	}
}
