package net.absoft.equation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testSolutionCreatingAndGetting ()
    {
        final double first = 1.1;
        final double second = 2.2;

        Solution solution = new Solution(first, second);

        Assert.assertEquals(first, solution.getFirstSolution(), "first solution is unexpectedly changed");
        Assert.assertEquals(second, solution.getSecondSolution(), "second solution is unexpectedly changed");
    }

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void testThrowsByCreateWithFirstNaN () {
        new Solution(Double.NaN, 0.0);
    }

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void testThrowsByCreateWithSecondNaN () {
        new Solution(0.0, Double.NaN);
    }

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void testThrowsByCreateWithBothArgumentsNaN () {
        new Solution(Double.NaN, Double.NaN);
    }
}
