package oop_exercises;

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
