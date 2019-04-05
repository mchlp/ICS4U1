package arrays_2d;

import java.util.Random;
import java.io.*;

public class SearchProblem {

    private int dimension;
    private int[][] a; // This is the sorted array

    /**
     * @param args
     */
    public static void main(String[] args) {
        SearchProblem s = new SearchProblem();
        System.out.println(s);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line;
            try {
                line = stdin.readLine();
            } catch (IOException e) {
                line = null;
            }
            if (line == null) break;
            try {
                int v = Integer.parseInt(line);
                if (s.findBinary(v)) System.out.println("found");
                else System.out.println("not found");
            } catch (NumberFormatException e) {
                System.out.println("A number please!");
            }
        }
    }

    /**
     * @param v the value to search for
     * @return True if v appears in this, false otherwise
     */
    private boolean findLinear(int v) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == v) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean findBinary(int v) {

        int leftColBound = 0;
        int rightColBound = a.length - 1;
        boolean foundLeft = false;

        // linear search for left and right col bounds
        for (int i = 0; i < a.length; i++) {
            if (a[0][i] >= v && a[a.length - 1][i] <= v) {
                if (!foundLeft) {
                    leftColBound = i;
                    foundLeft = true;
                }
            } else {
                if (foundLeft) {
                    rightColBound = i - 1;
                    break;
                }
            }
        }

        if (!foundLeft) {
            return false;
        }
        System.out.println(leftColBound + " " + rightColBound);

        // binary search each possible column
        for (int i = leftColBound; i <= rightColBound; i++) {
            int top = 0;
            int bottom = a.length;

            while (top <= bottom) {
                int middle = (top + bottom) / 2;
                if (a[middle][i] == v) {
                    return true;
                } else if (a[middle][i] > v) {
                    top = middle + 1;
                } else {
                    bottom = middle - 1;
                }
            }
        }
        return false;
    }

    private boolean startFindRecursive(int v) {
        return findRecursive(v, 0, 0, dimension-1, dimension-1);
    }

    private boolean findRecursive(int v, int top, int left, int bottom, int right) {
        if (top == bottom && left == right) {
            return a[top][left] == v;
        }

        int middlex = (left + right) / 2;
        int middley = (top + bottom) / 2;

        return false;
    }

    /**
     * Generate a string representation of a search problem as in the problem statement d=this.dimension a[0][d-1]
     * a[1][d-1] ... a[d-1][d-1] ... a[0][0]   a[1][0]   ... a[d-1][0]
     */
    public String toString() {
        String s = "";

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                s += a[i][j] + "\t";
            }
            s += "\n";
        }

        return s;
    }

    /**
     * Create a default search problem of size 10 by 10
     */
    public SearchProblem() {
        this(10);
    }

    /**
     * Create an instance of a search problem of size n by n with 'random' integers. Across rows numbers increase, up
     * columns numbers increase.
     **/
    public SearchProblem(int n) {
        this.dimension = n;
        Random generator = new Random();
        // Hint: Find the largest neighbour and increase by a random amount
        // use Math.max(a,b) and generator.nextInt(10000);

        this.a = new int[dimension][dimension];

        for (int i = a.length-1; i >= 0; i--) {
            for (int j = 0; j < a[0].length; j++) {

                int maxNeigh = Integer.MIN_VALUE;
                maxNeigh = 0;
                if (i < a.length-1) {
                    maxNeigh = Math.max(maxNeigh, a[i + 1][j]);
                }
                if (j > 0) {
                    maxNeigh = Math.max(maxNeigh, a[i][j - 1]);
                }

                a[i][j] = maxNeigh + generator.nextInt(10000);
            }
        }
    }
}
