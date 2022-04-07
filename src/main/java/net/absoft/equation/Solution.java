package net.absoft.equation;

public class Solution {

    /*
        В соответствии с ТЗ:
            ... Результат: обʼєкт Solution з полями x1 = 5, x2 = -1  ...
            ... обʼєкт класу Solution (структура даних, що зберігає 2 цілих числа з коренями рівняння) ...
     */
    public final double x1, x2;

    public Solution (double firstValue, double secondValue)
    {
        if (Double.isNaN(firstValue)) {
            throw new IllegalArgumentException("solution can't be NaN");
        }

        if (Double.isNaN(secondValue)) {
            throw new IllegalArgumentException("solution can't be NaN");
        }

        this.x1 = firstValue;
        this.x2 = secondValue;
    }

    public double getFirstSolution () {
        return this.x1;
    }

    public double getSecondSolution () {
        return this.x2;
    }
}
