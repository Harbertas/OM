import java.util.ArrayList;

public class Algoritmas {
    // Student card's the last 2 digits
    protected final static int a = 5, b = 4;

    protected double l, r, L, x1, x2, xmin;

    protected int countWhileExecutions = 0; // How many times While loop was executed
    protected int countFunctionExecutions = 0; // How many times function f() was executed

    public ArrayList<Double> x1arr = new ArrayList<>(); // Store x1 points
    public ArrayList<Double> x2arr = new ArrayList<>(); // Store x2 points

    // Constructor
    public Algoritmas() {}

    void whoAmI() {
        System.out.println(this.getClass());
    }

    // Getters
    public double getCountWhileExecutions (){
        return this.countWhileExecutions;
    }
    public double getCountFunctionExecutions (){
        return this.countFunctionExecutions;
    }
    public double getl (){
        return this.l;
    }
    public double getr (){
        return this.r;
    }
    public double getL (){
        return this.L;
    }

    // Math equation function
    public double f(double x) {
        countFunctionExecutions++;
        // Define the function to be minimized
        return (Math.pow((Math.pow(x, 2) - a), 2) / b) - 1;
    }

    public void print(){
        System.out.println("While loop executed: " + getCountWhileExecutions() + " times");
        System.out.println("Function f() was called: " + getCountFunctionExecutions() + " times");
        System.out.println("New interval is [" + getl() + "; " + getr() + "]");
        System.out.println("New interval length is: " + getL());
        System.out.println("Minimum value of f(x) = " + f(xmin) + " at x = " + xmin);
        System.out.print("x1 values: ");
        for(double i : x1arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("x2 values: ");
        for(double i : x2arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
