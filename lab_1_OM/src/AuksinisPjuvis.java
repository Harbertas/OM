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
		double f1 = f(x1);
		double f2 = f(x2);

		while (L > eps) {
			x1arr.add(x1);
			x2arr.add(x2);
			if (f2 < f1) {
				l = x1;
				L = r - l;
				x1 = x2;
				x2 = l + phi*L;
				f1 = f2;
				f2 = f(x2);
			}
			else {
				r = x2;
				L = r - l;
				x2 = x1;
				x1 = r - phi*L;
				f2 = f1;
				f1 = f(x1);
			}
			countWhileExecutions++;
		}

		xmin = (r + l) / 2;
		// Return the minimum value of f(x) in the interval [a, b]
		return (r + l) / 2;
	}
}