package com.HomeWork;
import java.lang.Math;
public class LineComparison {
	//Display Welcome Text lc

	public void display() {
		System.out.println("Welcom to Line Comparision Program on Master Branch");
	}
	
	//Calculate Length of Line
	
	public double lengthofLine(int x1, int x2, int y1, int y2) {
		double res = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
		return res;
	}
	
	//Comparing Lines (built in compare to is not used for double)
	public boolean compareTo(double line1, double line2) {
		if(line1 == line2) {
			return true;
		}
		else {
			 return false;
		}
	}
	
	public static void main(String args[]) {
		LineComparison lc = new LineComparison();
		// Scanner sc = new Scanner(System.in);
		// int x1 = sc.nextint()
		lc.display();
		double line1 = lc.lengthofLine(18,6,12,4);
		double line2 = lc.lengthofLine(18,6,12,4);
		System.out.println(line1);
		System.out.println(line2);
		System.out.println("Lines are : " + lc.compareTo(line1,line2));

	}
}


