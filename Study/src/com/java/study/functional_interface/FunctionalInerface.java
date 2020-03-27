package com.java.study.functional_interface;

// Can be implemented in class 
@FunctionalInterface
interface A {
	public void test();
	default void demo() {} // Allowed static and concrete methods.
}

interface B extends A {
	public void demo();
}

// Not Possible its breaking rule
//@FunctionalInterface
//interface B extends A {
//	public void demo();
//}


public class FunctionalInerface {
	public static void main(String[] args) {
		A a1 = ()->{System.out.println("Printing Something!!");};
	}
	
}
