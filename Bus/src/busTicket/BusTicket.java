package busTicket;


public interface BusTicket {
	
	 void bookTicket(int ticket);
	 void cancleTicket(int ticket);
	 int  available();
	 String displyErrorOfMessage();

}
