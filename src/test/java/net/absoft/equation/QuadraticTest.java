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

        Assert.assertNotNull(solution, " ");

        Assert.assertEquals(solution.getFirstSolution(), x, "");
        Assert.assertEquals(solution.getSecondSolution(), x,"");
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
        long a = 3, b = -4, c = 2;

        Quadratic quadratic = new Quadratic ();
        Solution solution = quadratic.getSolution(a, b, c);

        Assert.assertNull(solution, " ");
    }

}
