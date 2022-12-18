package com;

import java.util.Scanner;

public class Solution {
	
	static int a;
	static int b;
	static void acceptInput() {
		System.out.println("Enter 1 number");
		a=scan.nextInt();
		System.out.println("Enter 2 number");
		b=scan.nextInt();
		
	}
	 static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Calculater calc=new CalculaterImp();
		System.out.println("1:Addition\n2:Subtraction\n3:Multipication\n4:Division\nEXIT");
		System.out.println("Enter Choice :");
		int choice=scan.nextInt();
		if(choice>=1&&choice<=4) {
			
		
		acceptInput();
		}
		switch(choice) {
		case 1:
			System.out.println(calc.add( a,  b));
		 break;
		
	    case 2:
		System.out.println(calc.sub( a,  b));
		 break;
	    case 3:
			System.out.println(calc.mul( a,  b));
			 break;
	    case 4:
			System.out.println(calc.div( a,  b));
			 break;
	    case 5:
			System.out.println("thank you");
			 break;
			default:
				System.out.println(calc.displyErrorMessage() );
			 
			 
	
		}
	}

}
