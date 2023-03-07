import java.lang.Math;

public class NiutonoMetodas {

	private final static int a = 5, b = 3;
	private static int countWhileExecutions = 0; // How many times While loop was executed
	private static int countFunctionExecutions = 0; // How many times function f() was executed
	private static int countPrimeFunctionExecutions = 0; // How many times function fprime() was executed

	// Function whose root we want to find
	static double f(double x) {
		countFunctionExecutions++;
		return Math.pow((Math.pow(x, 2) - a), 2) / (b-1);
	}

	// Derivative of the function
	static double fprime(double x) {
		countPrimeFunctionExecutions++;
		return 2*x*(Math.pow(x, 2) - 5);
	}

	public static void main(String[] args) {
		double x0 = 5.0; // Initial guess
		double eps = 1e-4;

		double x = x0;

		double fx = f(x);
		double fpx = fprime(x);
		double delta = fx / fpx;

		System.out.print("x1 values: " + x + " ");

		while (Math.abs(delta) > eps) {
			x = x - delta;
			fx = f(x);
			fpx = fprime(x);
			delta = fx / fpx;

			countWhileExecutions++;

			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("While loop executed: " + NiutonoMetodas.countWhileExecutions + " times");
		System.out.println("Function f() was called: " + NiutonoMetodas.countFunctionExecutions + " times");
		System.out.println("Function fprime() was called: " + NiutonoMetodas.countPrimeFunctionExecutions + " times");
	}
}





