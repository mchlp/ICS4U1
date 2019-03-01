package oop_exercises;

public class Tester {
    public static void main(String[] args) {
        Die die = new Die();
        die.setNumSides(4);
        double[] bias = {0.2, 0.3, 0.5, 0};
        die.setBias(bias);

        int[] res = new int[4];
        int total = 0;
        for (int i = 0; i <10000000; i++) {
            res[die.roll() - 1]++;
            total++;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(i + 1 + " - " + (double) res[i] / total);
        }
    }
}
