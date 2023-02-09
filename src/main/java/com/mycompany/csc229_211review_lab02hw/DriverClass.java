package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class
		
		// Takes input from the user by using the scanner class and stores them in variables	 
		Scanner sc = new Scanner(System.in);
                // Asks the user user to his name
                System.out.print("Enter the student's name: ");
                // Goes to the next line
                String name = sc.nextLine();
                // asks for age of student
                System.out.print("Enter the student's age: ");
                // goes to the next short
                short age = sc.nextShort();
                // goes to the next line
                sc.nextLine();
                // asks for more user input
                System.out.print("Enter the student's address: ");
                //goes to the next line
                String address = sc.nextLine();
                // asks for more user input
                System.out.print("Enter the student's GPA: ");
                // goes to the next float
                float gpa = sc.nextFloat();
               // creates student object and takes in 
               Student std1 = new Student(name, age);
               // sets the GPA for student
               std1.setGpa(gpa);
               
               System.out.println(std1);
               // closes opened scanner
               sc.close();
		
		
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}