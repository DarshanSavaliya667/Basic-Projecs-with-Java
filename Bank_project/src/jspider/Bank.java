package jspider;

public interface Bank {

	void deposit(int amount);
	void withdrow(int amount);
	int getMessage();
	String displyErrorMessage();
}
//All the above method are automatically public and abstract