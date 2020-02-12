package demo;

import java.util.function.Function;

public class FunctionUppercaseDemo {

	public static void main(String[] args) {
		Function<String,String> uppercaseConverter = (str) -> str.toUpperCase();
		String input = "This is a test String";
		System.out.println("New String: " + uppercaseConverter.apply(input));
	}

}
