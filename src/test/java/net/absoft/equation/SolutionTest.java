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
}
