package com.Homework;
import java.util.Scanner;
public class HarmonicNumber {
	static double result(int num)
	{
		float result = 1;
		for (int i = 1; i<=num; i++) {
			result = result + (float)1/i;
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		System.out.println(result(num));
	}
}