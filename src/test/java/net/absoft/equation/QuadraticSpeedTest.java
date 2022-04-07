package net.absoft.equation;

import org.testng.annotations.Test;

public class QuadraticSpeedTest {

    /*
            CPU:  AMD Ryzen 5 2600 Six-Core 3.40 GHz
            Thread: 1
            Iteration: ~ 8*10^9

            Quadratic.java                   seconds
                .getSolution(a, b, c)          76
            QuadraticFast.java
                .getSolution(a, b, c)          42
     */

    @Test
    public void testForSpeed () {
        //testSubSpeed( new Quadratic() );
        //testSubSpeed( new QuadraticFast() );
    }

    private void testSubSpeed (Quadratic quadratic) {
        long count_null = 0, count_1 = 0, count_2 = 0;

        for (long a = -1000; a < 1000; a++) {
            if (a == 0) a++;
            for (long b = -2000; b < 2000; b += 2) {
                for (long c = -3000; c < 3000; c += 3) {

                    Solution solution = quadratic.getSolution(a, b, c);

                    if (solution == null) count_null++;
                    else if (solution.x1 == solution.x2) count_1++;
                    else count_2++;


                }
            }
        }
        System.out.println(" 0: " + count_null + "\n 1: " + count_1 + "\n 2: " + count_2);
    }
}
