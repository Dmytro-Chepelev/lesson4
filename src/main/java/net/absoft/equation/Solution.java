package net.absoft.equation;

public class Solution {

    private final double firstSolution, secondSolution;

    public Solution (double firstSolution, double secondSolution)
    {
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
