package jspider;

import java.util.Scanner;



public class main {
	
	public static void main(String[] args) {
		Bank bank=new BankImp(5000); //upcasting Abstrection
		Scanner scan= new Scanner(System.in);
	
	while(true) {
		
//		Bank bank=new BankImp(5000); //upcasting Abstrection	
			System.out.println("1.Diposit\n2.Withdrow Amount\n3.Check Balance\n4.Exit");
			System.out.println("Enter Choice");
			
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Amount to be Deposited");
				int amountToDeposite=scan.nextInt();
				bank.deposit(amountToDeposite);//bank.deposit(scan.nextInt());
				System.out.println("AVAILABLE BALANCE :RS"+bank.getMessage());
				System.out.println("thank you !!");
				
				
				break;
			case 2:
				System.out.println("Enter Amount to be withdrow");
				int amountTowithdrow=scan.nextInt();
				bank.withdrow(amountTowithdrow);//bank.withdrow(scan.nextInt());
				System.out.println("AVAILABLE BALANCE :RS"+bank.getMessage());
				System.out.println("thank you !!");
				break;
			case 3:
				System.out.println("AVAILABLE BALANCE :RS"+bank.getMessage());
				System.out.println("thank you !!");
				
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
}

	
