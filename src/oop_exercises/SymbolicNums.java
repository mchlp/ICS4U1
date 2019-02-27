package oop_exercises;

public class SymbolicNums {

    public static void main(String[] args) {

        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();

        fraction1.setNumerator(3);
        fraction1.setDenominator(5);
        fraction1 = fraction1.mul(2);
        System.out.println(fraction1);

        fraction1.setNumerator(3);
        fraction1.setDenominator(4);
        fraction1 = fraction1.mul(8);
        System.out.println(fraction1);

        fraction1.setNumerator(3);
        fraction1.setDenominator(5);
        fraction1 = fraction1.divide(2);
        System.out.println(fraction1);

        fraction1.setNumerator(4);
        fraction1.setDenominator(7);
        fraction1 = fraction1.divide(2);
        System.out.println(fraction1);

        fraction1.setNumerator(1);
        fraction1.setDenominator(3);
        fraction1 = fraction1.add(fraction1);
        System.out.println(fraction1);

        fraction1.setNumerator(1);
        fraction1.setDenominator(8);
        fraction2.setNumerator(3);
        fraction2.setDenominator(4);
        fraction1 = fraction1.add(fraction2);
        System.out.println(fraction1);

        fraction1.setNumerator(1);
        fraction1.setDenominator(2);
        fraction2.setNumerator(1);
        fraction2.setDenominator(3);
        fraction1 = fraction1.add(fraction2);
        System.out.println(fraction1);

        fraction1.setNumerator(3);
        fraction1.setDenominator(4);
        fraction2.setNumerator(1);
        fraction2.setDenominator(4);
        fraction1 = fraction2.sub(fraction1);
        System.out.println(fraction1);

        fraction1.setNumerator(3);
        fraction1.setDenominator(4);
        fraction2.setNumerator(2);
        fraction2.setDenominator(3);
        fraction1 = fraction2.sub(fraction1);
        System.out.println(fraction1);
    }


}
