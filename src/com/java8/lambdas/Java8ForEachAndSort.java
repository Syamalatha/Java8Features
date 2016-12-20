package com.java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Java8ForEachAndSort {

	public static void main(String[] args) {
		List<Customer> custList = new ArrayList<Customer>();
		custList.add(new Customer("John"));
		custList.add(new Customer("David"));
		custList.add(new Customer("Michelle"));
		
		List<Customer> custList2 = new ArrayList<Customer>(custList);
		
		//traversing using Iterator
		Iterator<Customer> it = custList.iterator();
		while(it.hasNext()){
			Customer cust = it.next();
			System.out.println("Custmer ::"+ cust.getName());
		}
		
		//Sorting using Anonymous Inner class based on name field in customer object.
		Collections.sort(custList, new Comparator<Customer>(){
		  public int compare(Customer c1, Customer c2){
		    return c1.name.compareTo(c2.name);
		  }
		});

		//Anonymous Inner class replaced with Lambda expression.
		System.out.println("************** before sorting **************** ");
		custList2.forEach( (Customer cust) -> System.out.println("Custmer ::"+ cust.getName() ));
		Collections.sort(custList2, (c1, c2) -> c1.name.compareTo(c2.name));
		System.out.println("************** after sorting **************** " );
		custList2.forEach( (Customer cust) -> System.out.println("Custmer ::"+ cust.getName() ));

	}

}


class Customer{
	String name;
	
	public Customer(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
