package automation.demo;

import java.util.Scanner;
import java.util.function.BiFunction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArithematicOperation {

	static BiFunction<Integer, Integer, Integer> add = (x1, x2) -> x1 + x2;
	static BiFunction<Integer, Integer, Integer> multiply = (x1, x2) -> x1 * x2;
	static BiFunction<Integer, Integer, Double> divide = (x1, x2) -> (double) x1 / x2;

	public static void main(String... args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value of x1 and x2 : ");
		try {
			int x1 = in.nextInt();
			int x2 = in.nextInt();

			System.out.println("Addition: " + add.apply(x1, x2));
			System.out.println("Multiplication: " + multiply.apply(x1, x2));
			System.out.println("Division: " + divide.apply(x1, x2));
		} catch (Exception e) {
			final Logger logger = LoggerFactory.getLogger(ArithematicOperation.class);
			logger.error("Error", e);
		}
		in.close();

	}

}
