package busTicket;

import java.util.Scanner;



class solution {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1.BookTicket\n2.CancleTicket\n3.Available\n4.Exit");
		System.out.println("Enter Choice");
//		BusTicket bus=new busTicketImp(5);//upcasting
		BusTicket bus=new busTicketImp();
		int choice=scan.nextInt();
		 switch(choice) {
		 case 1:
			 System.out.println("Enter the how much Ticket");
				int ticketnumber=scan.nextInt();
				bus.bookTicket(ticketnumber);//bank.deposit(scan.nextInt());
				break;
		 case 2:
			 System.out.println("Enter the  how much Ticket Cancle ");
				int cancleTicketnumber=scan.nextInt();
				bus.cancleTicket(cancleTicketnumber);//bank.withdrow(scan.nextInt());
				break;
		 case 3:
			 System.out.println("AVAILABLE TICKET :RS "+bus.available());
			 break;
		 case 4:
			 System.out.println("Thank you!!");
			 System.exit(0);
		 default:
				System.out.println(bus.displyErrorOfMessage());
		 }
	}

}
