package com.java8.defaultInterface;

public class DefaultMainClass {

	public static void main(String[] args) {

		//method references is constructor reference with the syntax Class::new 
		Defaulable defaulable = Defaulable.create( DefaultableImpl::new ); 
		System.out.println( defaulable.notRequired() ); 

		defaulable = Defaulable.create( OverridableImpl::new ); 
		System.out.println( defaulable.notRequired() ); 
 
	}

}
