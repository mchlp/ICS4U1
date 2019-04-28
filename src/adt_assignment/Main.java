package adt_assignment;

import java.util.HashSet;
import java.util.Scanner;

/*
Questions
- guaranteed that both starting and final genes are valid genes
- constraints for L, S, M, G
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int S = in.nextInt();
        in.nextLine();

        HashSet<String> allowedGenes = new HashSet<>();

        for (int i=0; i<S; i++) {
            String gene = in.nextLine();
            allowedGenes.add(gene);
        }

        int M = in.nextInt();

        GeneGraph geneGraph = new GeneGraph(allowedGenes, L, M);

        int G = in.nextInt();
        in.nextLine();

        for (int i=0; i<G; i++) {
            String[] line = in.nextLine().split(" ");
            String gene1 = line[0];
            String gene2 = line[1];
            int minDis = geneGraph.getFastestMutation(gene1, gene2);
            System.out.println(minDis == -1 ? "NO" : "YES");
            System.out.println(minDis);
        }


    }

}
