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
        double x1, x2;

        if (discriminant > 0.0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
        }
        else if (discriminant == 0.0) {
            x1 = -b / (2.0 * a);
            x2 = x1;
        }
        else { // discriminant < 0.0
            return null;
        }
        return new Solution (x1, x2);

    }
}
