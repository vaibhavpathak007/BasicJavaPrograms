
package com.java.study.other;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		// Programmer.StringContains();
		// Programmer.PrimeNumberToHundred();
		// Programmer.SotHashMapByValue();
		Programmer.binaryConverter();
	}

}

class Programmer {
	
	// To calculate count 'abc' in string.
	public static void StringContains() {
		String temp = "abcxyzabcpqrabcmnoab";
		char[] x = temp.toCharArray();
		int counter = 0;

		for (int i = 0; i < x.length; i++) {
			// to avoid null pointer exception.
			if (i + 2 < temp.length()) {
				if (x[i] == 'a' && x[i + 1] == 'b' && x[i + 2] == 'c') {
					counter++;
				}
			}
		}
		System.out.println("Duplicate is : " + counter);
	}
	
	// Print Prime number from 1 to 100
	public static void PrimeNumberToHundred() {
		// Iterate till 100
		for(int i=1; i<=100; i++) {
			int counter = 0;
			// Assign j = i 
			// Divide i with j and decrement j by -1 till > 0
			for(int j=i; j>0; j--) {
				if(i % j == 0) {
					counter++;
				}
			}
			if(counter == 2) {
				System.out.println("Prime Number = "+ i);
			}
		}
	}
	
	// Hashmap Sorting by values 
	public static void SotHashMapByValue() {
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		
		h1.put("vaibhav", 4);
		h1.put("vikas", 1);
		h1.put("pathak", 3);
		h1.put("abc", 2);
		h1.put("pqr", 5);
		
		// Logic 1 : with tree set
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		h1.entrySet().stream().forEach(e->t1.add(e.getValue()));
		System.out.println(t1);
		
		//Logic 2 : with values returns collection<Integer>
		List<Integer> l1 = h1.values().stream()
				.sorted((o1,o2)->o1>o2?1:-1)     // Reverse comparator
				.collect(Collectors.toList());
		System.out.println(l1);
		
	}
	
	public static void binaryConverter() {
		StringBuilder s1 = new StringBuilder();
		int number = 2;
		
		System.out.println("Number: "+ number);
		int quotient = number/2;
		int reminder = number%2;
		
		s1.append(reminder);
		
		while(quotient != 0) {
			reminder = quotient % 2;
			s1.append(reminder);
			quotient = quotient / 2;
		}
		
		s1.reverse();
		System.out.println(s1);
		
	}
	
}


