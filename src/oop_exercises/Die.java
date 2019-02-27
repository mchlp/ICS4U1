package oop_exercises;

/*
 * Michael Pu
 * Mr. Radulovic
 * 2019/02/26
 * ICS4U1
 *
 * Represents a single N-sided die with the ability for custom biases to be set.
 * It supports getting and setting the number of sides, setting a custom bias, as well as rolling the die which
 * will produce results according to the set bias. By default, the bias is set to equal distribution among all sides.
 */

public class Die {

    private double[] biases;

    public int getNumSides() {
        return this.biases.length;
    }

    public void setNumSides(int N) {
        this.biases = new double[N];
        for (int i=0; i<N; i++) {
            this.biases[i] = 1.0/N;
        }
    }

    public void setBias(double[] biases) {
        this.biases = biases;
    }

    public int roll() {
        double rand = Math.random();
        double lowerBound = 0;
        double upperBound = 0;
        for (int i=0; i<biases.length; i++) {
            upperBound += biases[i];
            if (rand >= lowerBound && rand < upperBound) {
                return i+1;
            }
            lowerBound = upperBound;
        }
        return -1; //should never execute
    }

}
