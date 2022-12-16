package com.Homework2;
import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args) {
		int n, i, count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		
		for(i=1;i<n;i++) {
			if(n%2 == 0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
	}
}
		
		