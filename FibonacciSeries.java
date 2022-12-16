package com.Homework2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n, a=0,b=0,c=1;
		System.out.print("enter number");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		System.out.print("FibonacciSeries");
		for(int i = 1; i<= n; i++) {
			a = b;
			b = c;
			c = a+b;
			System.out.print(a+" ");
		}

	}

}
