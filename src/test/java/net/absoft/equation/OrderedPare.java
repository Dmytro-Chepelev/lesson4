package net.absoft.equation;

public class OrderedPare {

        private final double big, little;

        public OrderedPare(double any1, double any2) {
            big = Math.max(any1,any2);
            little = Math.min(any1,any2);
        }

        public boolean isEqual(OrderedPare duo) {
            if (duo == null) return false;
            return this.big == duo.big && this.little == duo.little;
        }
}
