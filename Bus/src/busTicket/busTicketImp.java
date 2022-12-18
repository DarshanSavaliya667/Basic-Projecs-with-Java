package busTicket;

public class busTicketImp implements BusTicket  {

	 private int totalTicket=5;
	  int totalmyticket;
	 
//	public busTicketImp(int totalTicket) {
//		
//		totalTicket = totalTicket;
//	}

	@Override
	public void bookTicket(int ticket) {
		
		
		if(totalTicket >=ticket) {
			System.out.println("Book The Bus Ticket "+ticket);
			totalTicket=totalTicket-ticket;
			totalmyticket=ticket;
			System.out.println("Bus Ticket Successfully!!");
			System.out.println("heppy journey !!");
		
		}
		else {
			try {
				
			throw  new ITE("insufficint busTicket");
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
	}

	@Override
	public void cancleTicket(int ticket) {
		
		if(totalmyticket>=totalTicket) {
		
		totalTicket=totalTicket+ticket;
		System.out.println("Cancle the Bus Ticket Successfully!!");
		
		}
		else {
			System.out.println("not Cancle ticket");
		}
	}

	@Override
	public int available() {
		
		return totalTicket;
	}

	@Override
	public String displyErrorOfMessage() {
	
		return  "Invalid choice,Kindaly Enter valid Choice!!"; 
	}
	

}
