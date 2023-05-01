package com.bridgelabz;

public class FindMaximum {
	
	public static Integer findMax(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		
		Integer max = firstNumber;
		
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		return max;
	}

	public static float findMax(Float firstNumber, Float secondNumber, Float thirdNumber) {
		
		float max = firstNumber;
	
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		return max;
	}
		
	public static String findMax(String firstNumber, String secondNumber, String thirdNumber) {
		
		String max = firstNumber;
		
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		return max;
	} 
	
	public static void main(String[] args) {
		
		int a;
		float b;
		String c;
		
		a = findMax(12, 45, 32); 
		System.out.println("Maximum number is: " + a);
		
		b = findMax(10.2F, 5.6F, 8.4F);	
		System.out.println("Maximum number is: " + b);
		
		c = findMax("Dipti", "Sneha", "Niha");
		System.out.println("Maximum number is: " + c);
	}
}