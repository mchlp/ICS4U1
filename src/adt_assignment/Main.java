package adt_assignment;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Wraps around the GeneGraphHash class to handle input and output.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int S = in.nextInt();
        in.nextLine();

        // create HashSet to store alllowed genes
        HashSet<String> allowedGenes = new HashSet<>();

        for (int i = 0; i < S; i++) {
            String gene = in.nextLine();
            allowedGenes.add(gene);
        }

        int M = in.nextInt();

        // create graph
        GeneGraphHash geneGraphHash = new GeneGraphHash(allowedGenes, L, M);

        int G = in.nextInt();
        in.nextLine();

        // loop through all queries
        for (int i = 0; i < G; i++) {
            String[] line = in.nextLine().split(" ");
            String gene1 = line[0];
            String gene2 = line[1];

            // get minimum distance for query
            Pair<Boolean, Integer> result = geneGraphHash.getFastestMutation(gene1, gene2);
            System.out.println(result.getKey() ? "YES" : "NO");
            System.out.println(result.getValue());
        }
    }
}
