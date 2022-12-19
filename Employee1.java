package Day9;

import java.util.Random;

public class Employee1 {

	public void display() {
		System.out.println("Welcome t0 Employee Wage Computation program");
	}
		
		//Checking wether Employee is present or not
		public boolean status() {
			Random rd = new Random();
			boolean ispresent = rd.nextBoolean();
			return ispresent;
		}
		
		//calculate Dialy Wage
		public int calcDialyWage(int workHours) {
			int wagePerHour = 20;
			int wage = wagePerHour * workHours;
			return wage;
		}
		
		//Monthly Wage Calculation
		public int calcMonthly() {
			int monthlyWage = 0;
			for(int i = 0; i <20; i++) {
				boolean ChckPresence = status();
				if(ChckPresence) {
					monthlyWage += calcDialyWage(8);
				}
			}
			return monthlyWage;
		}
		
		//calculate PartTime
		public int calcPartTimeWage() {
			int wagePerHour = 20;
			return wagePerHour;
		}
		
		public static void main(String[] args) {
			Employee1 emp1 = new Employee1();
			emp1.display();
			System.out.println("Employee Monthily Wage : " + emp1.calcPartTimeWage() + "\n");
		
	}
}


