public class AuksinisPjuvis extends Algoritmas{

	// Constructor
	public AuksinisPjuvis(double left, double right) {
		l = left ;
		r = right;
		L = r - l;
	}

	@Override
	void whoAmI() {
		System.out.println("Starting Golden cut algorithm");
	}

	public double goldenSectionSearch() {
		// Set the epsilon value
		double eps = 1e-4;

		// Set the golden ratio
		double phi = (-1 + Math.sqrt(5)) / 2;

		// Calculate the initial values of x1, x2, and f(x1), f(x2)
		x1 = r - phi*L;
		x2 = l + phi*L;

		while (L > eps) {
			x1arr.add(x1);
			x2arr.add(x2);
			if (f(x2) < f(x1)) {
				l = x1;
				L = r - l;
				x1 = x2;
				x2 = l + phi*L;
			} else {
				r = x2;
				L = r - l;
				x2 = x1;
				x1 = r - phi*L;
			}
			countWhileExecutions++;
		}

		xmin = (r + l) / 2;
		// Return the minimum value of f(x) in the interval [a, b]
		return (r + l) / 2;
	}
}