package com.Homework;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year");
		Scanner input =new Scanner(System.in);
		int year = input.nextInt();
		if(year%4==0)
		{
			System.out.println("Leap year");
		}
		else if(year%4==0 && year%1!=0) 
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}

	}

}
