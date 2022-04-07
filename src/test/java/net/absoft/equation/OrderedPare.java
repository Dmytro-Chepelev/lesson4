package net.absoft.equation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderedPare {

        private final double big, little;

        public OrderedPare(double x, double y) {
            big = Math.max(x,y);
            little = Math.min(x,y);
        }

        public boolean isEqual(OrderedPare duo) {
            if (duo == null) return false;
            return this.big == duo.big && this.little == duo.little;
        }



}
