package net.absoft.equation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticTest {

    @Test
    public void testWithOneSolution () {
        long a = 3, b = -18, c = 27;
        double x = 3.0;

        Quadratic quadratic = new Quadratic ();
        Solution solution = quadratic.getSolution(a, b, c);

        Assert.assertNotNull(solution, "getSolution() can't compute result");

        Assert.assertEquals(solution.getFirstSolution(), x, "unexpected value of first solution");
        Assert.assertEquals(solution.getSecondSolution(), x,"second solution is not equal first");

        Assert.assertEquals(solution.x1, x, "unexpected value of first solution");
        Assert.assertEquals(solution.x2, x,"second solution is not equal first");

    }

    @Test
    public void testWithTwoSolutions () {
        long a = 1, b = -4, c = -5;
        double x1 = -1.0, x2 = 5.0;
        OrderedPare expectedValue = new OrderedPare(x1, x2);

        Quadratic quadratic = new Quadratic ();
        Solution solution = quadratic.getSolution(a, b, c);

        Assert.assertNotNull(solution, "getSolution() can't compute result");

        OrderedPare byFunctionValue = new OrderedPare(solution.getFirstSolution(), solution.getSecondSolution());
        OrderedPare byFieldValue = new OrderedPare(solution.x1, solution.x2);

        Assert.assertTrue (byFunctionValue.isEqual(expectedValue), "expected and computed solution (get by getter) is not equal");
        Assert.assertTrue (byFieldValue.isEqual(expectedValue), "expected and computed solution (get by field) is not equal");
    }

    @Test
    public void testWithoutSolution () {
        long a = 3, b = -4, c = 2;

        Quadratic quadratic = new Quadratic ();
        Solution solution = quadratic.getSolution(a, b, c);

        Assert.assertNull(solution, "getSolution() compute result, but must not do it");
    }

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void testNonQuadraticEquation () {
        long a = 0, b = 1, c = 1;

        Quadratic quadratic = new Quadratic ();
        Solution solution = quadratic.getSolution(a, b, c);
    }

}
