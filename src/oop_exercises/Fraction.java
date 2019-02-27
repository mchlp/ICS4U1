package oop_exercises;

public class Fraction {

    private int numerator;
    private int denominator;

    private void reduce() {
        int num1 = this.denominator;
        int num2 = this.numerator;

        if (num2 != 0) {
            while (num1 % num2 != 0) {
                int newNum2 = num1 % num2;
                num1 = num2;
                num2 = newNum2;
            }

            this.numerator /= num2;
            this.denominator /= num2;
        }
    }

    public void setNumerator(int a) {
        this.numerator = a;
    }

    public void setDenominator(int b) {
        this.denominator = b;
    }

    public Fraction mul(int n) {
        Fraction fraction = new Fraction();
        fraction.setNumerator(this.numerator*n);
        fraction.setDenominator(this.denominator);
        fraction.reduce();
        return fraction;
    }

    public Fraction divide(int n) {
        Fraction fraction = new Fraction();
        fraction.setNumerator(this.numerator);
        fraction.setDenominator(this.denominator * n);
        fraction.reduce();
        return fraction;
    }

    public Fraction add(Fraction b) {
        Fraction fraction = new Fraction();
        fraction.setNumerator(this.numerator * b.denominator + b.numerator * this.denominator);
        fraction.setDenominator(this.denominator * b.denominator);
        fraction.reduce();
        return fraction;
    }

    public Fraction sub(Fraction b) {
        Fraction fraction = new Fraction();
        fraction.setNumerator(b.numerator * this.denominator - this.numerator * b.denominator);
        fraction.setDenominator(this.denominator * b.denominator);
        fraction.reduce();
        return fraction;
    }

    public String toString() {
        if (this.denominator == 0) {
            if (this.numerator < 0) {
                return "-inf";
            } else if (this.numerator > 0) {
                return "+inf";
            } else {
                return "indeterminate";
            }
        } else {
            return this.numerator + "/" + this.denominator;
        }
    }

}
