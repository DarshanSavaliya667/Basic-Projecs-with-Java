package busTicket;

public class ITE extends RuntimeException{
	

	String message;

	public ITE(String message) {
		
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
