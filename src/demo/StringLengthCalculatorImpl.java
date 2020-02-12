package demo;

public class StringLengthCalculatorImpl {

	public static void main(String[] args) {
		StringLengthCalculator strLengthCalculator = str -> System.out.println("Length of the String " + str + " is: " + str.length());
		strLengthCalculator.printLength("Hello World");
		strLengthCalculator.printLength("I'm testing lambda expressions");
	}

}
