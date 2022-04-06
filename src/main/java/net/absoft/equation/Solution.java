package net.absoft.equation;

public class Solution {

    private final double firstSolution, secondSolution;

    public Solution (double firstSolution, double secondSolution)
    {
        if (Double.isNaN(firstSolution)) {
            throw new IllegalArgumentException("solution can't be NaN");
        }

        if (Double.isNaN(secondSolution)) {
            throw new IllegalArgumentException("solution can't be NaN");
        }

        this.firstSolution = firstSolution;
        this.secondSolution = secondSolution;
    }

    public double getFirstSolution () {
        return this.firstSolution;
    }

    public double getSecondSolution () {
        return this.secondSolution;
    }
}
