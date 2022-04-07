package net.absoft.equation;

public class Quadratic {

    public Solution getSolution (long a, long b, long c) {
        if (a == 0) {
            throw new IllegalArgumentException ("in Quadratic equation first argument 'a' must be nonzero");
        }

        double discriminant = computeDiscriminant(a, b, c);

        return discriminant < 0.0
                ? null
                : new Solution ( computeFirstRoot  (a, b, discriminant),
                                 computeSecondRoot (a, b, discriminant));
    }

    private double computeDiscriminant (double a, double b, double c) {
        return b * b - 4.0 * a * c;
    }

    private double computeFirstRoot(double a, double b, double discriminant) {
        return ( -b - Math.sqrt(discriminant) ) / (2.0 * a);
    }

    private double computeSecondRoot(double a, double b, double discriminant) {
        return ( -b + Math.sqrt(discriminant) ) / (2.0 * a);
    }
}
