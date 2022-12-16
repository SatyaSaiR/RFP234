package com.HomeWork;
import java.util.Random;
public class empwage {

	public void display(){
			        System.out.println("Welcome to Employee Wage Computation Program \n");
			    }
			    
			    //Checking wether Employee Present or Not
			    public boolean status(){
			        Random rd = new Random(); //Object Instantiation
			        boolean isPresent = rd.nextBoolean();
			        return isPresent;
			    }
			    
			    //Calculate Dialy Wage
			    public int calcDialyWage(int workHours){
			        int wagePerHour = 20;
			        int wage = wagePerHour * workHours;
			        return wage;
			    }
			    
			   //Calculate Parttime 
			    public int calcPartTimeWage(int workHours){
			        int wagePerHour = 20;
			        int wage = wagePerHour * workHours;
			        
			        return wage;
			    }
			  //Calculate Monthly Wage
			    public int calcMonthly() {
			    	int MonthlyWage = 0;
			    	for(int i = 0; i < 20; i++) {
			    		boolean CheckPresence = status();
			    		if(CheckPresence) 
			    		{
			    			MonthlyWage += calcDialyWage(8);
			    		}
			    			
			    	}
			    		return MonthlyWage;
			    	
			    }
			    
			    
			    
			    public static void main(String[] args) {
			        empwage emp1 = new empwage();
			        emp1.display();
			        System.out.println("Employee Monthly Wage : " + emp1.calcMonthly() + "\n");
			        System.out.println("Employee Dialy Wage : " +  emp1.calcDialyWage(8) + "\n");
			    }
			    }
			       