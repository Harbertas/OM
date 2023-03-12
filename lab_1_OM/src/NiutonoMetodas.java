
public class NiutonoMetodas {

	private final static int a = 5, b = 3;
	private static int countWhileExecutions = 0; // How many times While loop was executed
	private static int countPrimePrimeFunctionExecutions = 0; // How many times function f() was executed
	private static int countPrimeFunctionExecutions = 0; // How many times function fprime() was executed

	// Derivative of the function
	static double fprime(double x) {
		countPrimeFunctionExecutions++;
		return 4 * x * (Math.pow(x, 2) - 5) / 3;
	}
	// Derivative of the derivative function
	static double fprimeprime(double x) {
		countPrimePrimeFunctionExecutions++;
		return (12 * Math.pow(x, 2) - 20) / 3;
	}

	static void calculate() {
		double x0 = 5.0; // Initial guess
		double eps = 1e-4;

		double x = x0;

		double fpx = fprime(x);
		double fppx = fprimeprime(x);
		double delta = fpx / fppx;

		System.out.print("x1 values: " + x + " ");

		while (Math.abs(delta) > eps) {
			x = x - delta;
			fpx = fprime(x);
			fppx = fprimeprime(x);
			delta = fpx / fppx;

			countWhileExecutions++;

			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("While loop executed: " + NiutonoMetodas.countWhileExecutions + " times");
		System.out.println("Function fprime() was called: " + NiutonoMetodas.countPrimeFunctionExecutions + " times");
		System.out.println("Function fprimeprime() was called: " + NiutonoMetodas.countPrimePrimeFunctionExecutions + " times");
	}
}





