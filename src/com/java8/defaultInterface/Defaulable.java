package com.java8.defaultInterface;

import java.util.function.Supplier;

public interface Defaulable {

	// Interfaces now allow default methods, the implementer may or  
    // may not implement (override) them. 
	    default String notRequired() {  
	    	return "Default implementation";  
	    } 
	    
	 // Interfaces now allow static methods 
    static Defaulable create( Supplier< Defaulable > supplier ) { 
    	return supplier.get(); 

     } 

}
