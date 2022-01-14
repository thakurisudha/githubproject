/**
 * 
 */
package com.cybersolveit.core.java;

/**
 * @author khage
 * 
 * This class is first basic class.....
 *
 */
public class HelloWorld {
	
	// global variable or field or attribute or member variable or instance variable
	
	static int ageMemberVariable = 28; // assignment operator 
	
	float checkingAccountBalance = 0;

	/**
	 * @param args
	 */
	
	// non-static variables are not allowed in static world but the vice versa is not true
	
	public static void main(String[] args) {
		
		// local variables inside a method
		
		System.out.println("Welcome to Java Programming!");
		
		//boolean, char, byte, short, int, long, float and double.
		
		boolean isClassHappening = true;
		
		System.out.println(isClassHappening);
		
		char aChar = '$'; // single quote
		System.out.println(aChar);
		
		String aString = "$"; //double quote
		byte thisIsAByte = 23;
		// bit: 0 & 1 and a byte: 8 bits 00101010 -- 2, 4, 8, 16, 32, 64, 128, 512, 1024 
		// kb : 1024 mb : 512MB 
		// 1 GB: 1024 mb
		
		short aShortData = 12;
		System.out.println(aShortData);
		
		long aLongType = 1L;
		System.out.println(aLongType);
		
		float aFloatType = 2;
		System.out.println(aFloatType);
		
		double aDoubleVariable = 4;
		System.out.println(aDoubleVariable);
		
		int age = 0;
		System.out.println(age);
		
		//short highestShortVariable = 32790;
		//System.out.println(ageMemberVariable);
		
	}
	
	public void addTwoNumbers(int a, int b) {
		System.out.println(ageMemberVariable);
	}
	
	public void sumOfAges() {
		System.out.println(ageMemberVariable);
	}
	

}
