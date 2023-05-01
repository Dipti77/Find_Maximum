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
	


	public static void main(String[] args) {
		
		int a;
		a = findMax(12, 45, 32);
		 
		System.out.println("Maximum number is: " + a);
	}
}
