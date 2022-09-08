package com.calcilatator;

import java.util.Scanner;

public class calculator {
	
	 
	private static String optionMsg= "Select one of the operation: ( + , _ , * , / )  or # to Exite \n";
	private static String numbersMsg= "Enter the number one by one :  \n";
	
	public static void read() {
		Double  num1 = null ;
		Double num2 = null;
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		
		do {
		
			try {
				System.out.println(optionMsg);
				Double result;
				char op = sc.next().charAt(0);
				if( op	!= '#' ) {
				System.out.println(numbersMsg);
				num1=sc.nextDouble();
				num2= sc.nextDouble();	
				}
		switch (op) {
		case '+':
			result=num1+num2;
			System.out.println(num1 + " + " +num2 + " = " + result + "\n");
			break; 
		
		case '-':
			result=num1 - num2;
			System.out.println(num1 + " - " +num2 + " = " + result  + "\n");
			break;
		 
		case '*':
			result=num1*num2;
			System.out.println(num1 + " * " +num2 + " = " + result  + "\n");
			break;
		 
		case '/':
			result=num1/num2;
			System.out.println(num1 + " / " +num2 + " = " + result  + "\n");
			break;
        
		case '#':
			System.out.println(" The calculator exite ");
			running = false;
			break;
		default:  
            System.out.println("You are enter wrong opration");
            
		}

			} catch (Exception e) {
				System.out.println(" wrong please enter number only \n");
				
			}
		} while (running == true);


}}