package jspider;

class BankImp implements Bank {
	
	 private int balance;
	

	public BankImp(int balance) {
		
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		
		System.out.println("Depositing Rs."+amount);
		balance+=amount;
		System.out.println("Amount depositing SuccessFully");
		
	}

	@Override
	public void withdrow(int amount) {
//		System.out.println("Withdrawing Rs."+amount);
		if(balance>=amount) {
			System.out.println("withdrowing Rs."+amount);
			balance-=amount;
			System.out.println("Amount withdrowing SuccessFully");
		}
		else {
			
			try {
				throw new IBE("insufficint Balance");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
		}
		
		
	}

	@Override
	public int getMessage() {
		
		return balance;
	}

	@Override
	public String displyErrorMessage() {
		
		return "Invalid choice,Kindaly Enter valid Choice!!";
	}
	
	

}
