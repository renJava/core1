package academy.kata.educational_process.core1.mod12;

public class Solution21101 {
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ComplexNumber thereIs = (ComplexNumber) o;
            return Double.compare(thereIs.re, re) == 0 && Double.compare(thereIs.im, im) == 0;
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(re, im);
        }
    }
}
