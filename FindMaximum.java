package com.bridgelabz;

import java.util.Scanner;

public class FindMaximum {
	
	public <T extends Comparable> T findMax(T firstNumber, T secondNumber, T thirdNumber) {
		
		T max = firstNumber;
		
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		return max;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void maximum(int n) {
		
		if (n == 1) {
			System.out.println("Enter three numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			System.out.println("The maximum number is: " + findMax(num1, num2, num3));			
		}
		else if (n == 2) {
			System.out.println("Enter three numbers");
			float num1 = sc.nextFloat();
			float num2 = sc.nextFloat();
			float num3 = sc.nextFloat();
			System.out.println("The maximum number is: " + findMax(num1, num2, num3));
		}
		else if (n == 3) {
			System.out.println("Enter three string");
			String num1 = sc.next();
			String num2 = sc.next();
			String num3 = sc.next();
			System.out.println("The maximum string is: " + findMax(num1, num2, num3));			
		}
		
	}
	
	public static void main(String[] args) {
		
		FindMaximum fm = new FindMaximum();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter number:");
			System.out.println("1. Integer");
			System.out.println("2. Float");
			System.out.println("3. String");
			System.out.println("4. Stop");
			int n = sc.nextInt();
			
			if (n == 1 || n == 2 || n == 3) {
				fm.maximum(n);
			}else {
				break;
			}
		}
	}
}