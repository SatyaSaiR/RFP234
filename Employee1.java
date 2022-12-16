package EmployeeWage;
import java.util.Random;
public class Employee1 {

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
	    
	    
	    
	    public static void main(String[] args) {
	        Employee1 emp1 = new Employee1();
	        emp1.display();
	        if(emp1.status()){
	             System.out.println("Employee Status : Present \n");
	             System.out.println("Employee Dialy Wage : " + emp1.calcDialyWage(8) + "\n");
	             System.out.println("Employee Part Time Wage : " + emp1.calcPartTimeWage(4) + "\n");
	        }
	        else{
	            System.out.println("Employee Status : Absent");
	        }
	        
	    }
	}