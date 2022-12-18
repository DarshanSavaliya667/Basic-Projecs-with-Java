package jspider;

import java.util.Scanner;

class Solution {

	static Bank bank=new BankImp(5000);
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("1.Diposit\n2.Withdrow Amount\n3.Check Balance\n4.Exit");
		System.out.println("Enter Choice");
		
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Amount to be Deposited");
			int amountToDeposite=scan.nextInt();
			bank.deposit(amountToDeposite);//bank.deposit(scan.nextInt());
			break;
		case 2:
			System.out.println("Enter Amount to be withdrow");
			int amountTowithdrow=scan.nextInt();
			bank.withdrow(amountTowithdrow);//bank.withdrow(scan.nextInt());
			break;
		case 3:
			System.out.println("AVAILABLE BALANCE :RS"+bank.getMessage());
			
			break;
		case 4:
			System.out.println("thank you !!");
			System.exit(0);
		default:
			System.out.println(bank.displyErrorMessage());
				
		}
		System.out.println("==============");
		
	}
	
}
