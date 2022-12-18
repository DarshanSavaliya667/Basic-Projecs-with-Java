package jspider;

class IBE extends RuntimeException {

	String message;

	public IBE(String message) {
		
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
