package gtgt;

public class Calculator {
	private int number1;
	private int number2;
	public Calculator(int num1, int num2) {
		this.number1=num1;
		this.number2=num2;
	}
	private int addNumbers() {
		return number1 + number2;
	}
	public void displayResult() {
		System.out.println("Sobir na broevite: " + addNumbers());
	}
}
