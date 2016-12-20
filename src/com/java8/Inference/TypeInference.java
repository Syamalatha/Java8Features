package com.java8.Inference;

public class TypeInference {

	public static void main(String[] args) { 
		
		final Value< String > value = new Value<>(); 
		//In Java 7, the below will not compile and should be rewritten to Value.< String >defaultValue()
		System.out.println(value.getOrDefault( "22", Value.defaultValue() )); 
	} 

}



class Value< T > { 
    public static< T > T defaultValue() {  
     return null;  
    } 
    public T getOrDefault( T value, T defaultValue ) { 
    	return ( value != null ) ? value : defaultValue; 
    } 
} 
