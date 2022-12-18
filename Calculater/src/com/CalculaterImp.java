package com;

public class CalculaterImp implements Calculater {

	@Override
	public String add(int a, int b) {
		
		return "sum of "+a+"&"+b+"is"+(a+b);
	}

	@Override
	public String sub(int a, int b) {
		
		return "Different of "+a+"&"+b+"is"+(a-b);
	}

	@Override
	public String mul(int a, int b) {
		
		return "Mul of "+a+"&"+b+"is"+(a*b);
	}

	@Override
	public String div(int a, int b) {
		
		if(b!=0) {
			return "Div of "+a+"&"+b+"is"+(a/b);
		}
		else {
			return "denominater is: 0";
		}
	}

	@Override
	public String displyErrorMessage() {
		return "Invalid Choice, Please Enter valid Choice! ";
	
	}
	

}
