package com.Homework;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array");
		
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = 0; j < arr.length; j++) 
			{
				arr [i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for(int i =0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
