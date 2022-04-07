package net.absoft.equation;

public class Quadratic {

    public Solution getSolution (long a, long b, long c) {
        if (a == 0) {
            throw new IllegalArgumentException ("in Quadratic equation first argument 'a' must be nonzero");
        }
        return getSolutionAtDouble (a, b, c);
    }

    private Solution getSolutionAtDouble (double a, double b, double c) {
        double discriminant = b * b - 4.0 * a * c;

        Solution solution;

        if (discriminant > 0.0) {
            double root = Math.sqrt(discriminant);
            solution = new Solution (
                    (-b - root) / (2.0 * a) ,
                    (-b + root) / (2.0 * a) );
        }
        else if (discriminant == 0.0) {
            double singleSolution = -b / (2.0 * a);
            solution = new Solution (singleSolution, singleSolution);
        }
        else { // discriminant < 0.0
            solution = null;
        }

        return solution;
    }
}
