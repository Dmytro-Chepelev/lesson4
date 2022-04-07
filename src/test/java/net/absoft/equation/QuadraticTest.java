package net.absoft.equation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticTest {

    @Test
    public void testWithOneSolution () {
        long a = 1, b = -6, c = -7;
        double x = 7.0;

        Quadratic quadratic = new Quadratic ();
        Solution solution = quadratic.getSolution(a, b, c);

        Assert.assertNotNull(solution, " ");

        Assert.assertEquals(x, solution.getFirstSolution(), "");
        Assert.assertEquals(x, solution.getSecondSolution(), "");
    }

    @Test
    public void testWithTwoSolutions () {
        long a = 1, b = -4, c = -5;
        double x1 = 5.0, x2 = -1.0;

        Quadratic quadratic = new Quadratic ();
        Solution solution = quadratic.getSolution(a, b, c);

        Assert.assertNotNull(solution, " ");

        Assert.assertEquals(x1, solution.getFirstSolution(), "");
        Assert.assertEquals(x2, solution.getSecondSolution(), "");
    }

    @Test
    public void testWithoutSolution () {
        long a = 1, b = -4, c = -5;

        Quadratic quadratic = new Quadratic ();
        Solution solution = quadratic.getSolution(a, b, c);

        Assert.assertNull(solution, " ");
    }

}
