import java.util.ArrayList;

public class DalijimasPusiau  extends Main{

	// [l, r];
	// L = r - l;
	// Xm = (l + r) / 2;
	// x1 = l + L/4; x2 = r - L/4;

	// f(x1) < f(Xm) {r = Xm; Xm = x1;}
	// f(x2) < f(Xm) {l = Xm; Xm = x2;}
	// f(x1) >= f(Xm) && f(x2) >= f(Xm) {l = x1; r = x2;}

	private double Xm;

	// Constructor
	public DalijimasPusiau(double left, double right) {
		l = left;
		r = right;
		L = r - l;
		Xm = (l + r) / 2;
	}

	// Interval division by half method implementation
	public double calculate() {
		// Set the epsilon value
		double eps = 1e-4;

		while(L > eps) {
			x1 = l + L/4;
			x2 = r - L/4;
			x1arr.add(x1);
			x2arr.add(x2);
			double f1 = f(x1);
			double f2 = f(x2);
			double fxm = f(Xm);
			if(f1 < fxm) {
				r = Xm;
				Xm = x1;
			}
			else if(f2 < fxm) {
				l = Xm;
				Xm = x2;
			}
			else {
				l = x1;
				r = x2;
			}
			L = r - l;
			countWhileExecutions++;
		}
		xmin = (r + l) / 2;
		// Return the minimum value of f(x) in the interval [a, b]
		return (r + l) / 2;
	}

	public static void main(String[] args) {
		DalijimasPusiau test = new DalijimasPusiau(0, 10);
		test.calculate();
		test.print();
	}
}
