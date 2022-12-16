package com.Homework;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double  windspeed, temperature, windchill;
		System.out.print("Enter temperature : ");
		temperature = sc.nextDouble();
		System.out.print("Enter wind speed : ");
		windspeed = sc.nextDouble();
		//calculate wind chill
		windchill = 35.74 + 0.6215 * temperature +(0.4275 * temperature - 35.75) * Math.pow(windspeed, 0.16);
		//	for results
		System.out.println("wind chill is :" + Math.pow(temperature,windspeed));
	}

}
