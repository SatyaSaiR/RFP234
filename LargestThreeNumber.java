package com.Homework;
import java. util.Scanner;
public class LargestThreeNumber {

	public static void main(String[] args) {
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number :");
		a = s.nextInt();
		System.out.print("Enter the second number:");
		b = s. nextInt();
		System.out.print("Enter the third number:");
		c = s.nextInt();
		if(a>b && a>c) {
			System.out.println("Largest number is:"+a);
		}
		else if(b>c) {
			System.out.println("Largest number is :"+b);
		}
		else {
			System.out.println("Largest number is :"+c);
		}
	}
}