
package com.java.study.other;



public class Practice {

	public static void main(String[] args) {
		// Programmer.StringContains();
		// Programmer.PrimeNumberToHundred();
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
	
}


