package com.Homework;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the letters");
		char ch = s.next().charAt(0);
		
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println(ch + " it is a consonant");
		}

	}

}
