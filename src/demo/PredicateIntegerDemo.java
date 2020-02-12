package demo;

import java.util.function.Predicate;

public class PredicateIntegerDemo {

	public static void main(String[] args) {
		Predicate<Integer> isEven = (input) -> input % 2 == 0;
		System.out.println("5 is even: " + isEven.test(5));
		System.out.println("12 is even: " + isEven.test(12));
	}

}
