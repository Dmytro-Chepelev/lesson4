package net.absoft.equation;

public class QuadraticFast extends Quadratic {

    public Solution getSolution (long a, long b, long c) {
        if (a == 0) {
            throw new IllegalArgumentException ("in Quadratic equation first argument 'a' must be nonzero");
        }

        long discriminant;

        try {
            discriminant = Math.subtractExact(Math.multiplyExact(b, b), Math.multiplyExact(c, Math.multiplyExact(4, a)));  // d = b*b - 4*a*c;
        }
        catch (ArithmeticException ae) {
            return new Quadratic().getSolution(a,b,c);
        }

        if (discriminant < 0) {
            return null;
        }

        double a2 = a*2;
        double mb = -b;

        if (discriminant == 0) {
            double root = mb / a2;
            return new Solution (root, root);
        }

        double rd = Math.sqrt( discriminant);
        return new Solution ( (mb - rd) / a2, (mb + rd) / a2);
    }
}
