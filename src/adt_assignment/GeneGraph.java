package adt_assignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GeneGraph {

    public static final String[] POSSIBLE_CHARS = {"A", "G", "C", "T"};

    private int geneLength;
    private int maxMutations;
    private HashSet<String> posGenes;
    private HashMap<String, ArrayList<String>> adjList;

    public GeneGraph(HashSet<String> genes, int L, int M) {
        this.geneLength = L;
        this.maxMutations = M;
        this.posGenes = genes;
        generateGraph();
    }

    public int getFastestMutation(String startGene, String endGene) {
        ArrayList<String> posStartingList = generatePossibleMutations(startGene);
        HashSet<String> posEndingList = new HashSet<>();
        posEndingList.addAll(generatePossibleMutations(endGene));

        int minDis = Integer.MAX_VALUE;
        boolean reachable = false;
        for (String posStarting : posStartingList) {
            int dis = getShortestPath(posStarting, posEndingList);
            if (dis != -1) {
                if (!reachable) {
                    reachable = true;
                }
                if (dis < minDis) {
                    minDis = dis;
                }
            }
        }
        return reachable ? minDis : -1;
    }

    private String swapAdjGene(String gene, int leftIndex) {
        assert leftIndex < geneLength - 1 : "leftIndex must be less than L-1";
        return gene.substring(0, leftIndex) + gene.charAt(leftIndex + 1) + gene.charAt(leftIndex) + gene.substring(leftIndex + 2);
    }

    private ArrayList<String> generatePossibleMutations(String gene) {
        assert gene.length() == geneLength : "Gene length must be L";

        ArrayList<String> posMutations = new ArrayList<>();

        for (int i = 0; i < geneLength; i++) {
            for (String posChar : POSSIBLE_CHARS) {
                String testGene = gene.substring(0, i) + posChar + gene.substring(i + 1);
                if (!testGene.equals(gene) && posGenes.contains(testGene)) {
                    posMutations.add(testGene);
                }
            }
        }

        for (int i = 0; i < geneLength - 1; i++) {
            String testGene = swapAdjGene(gene, i);
            if (!testGene.equals(gene) && posGenes.contains(testGene)) {
                posMutations.add(testGene);
            }
        }

        return posMutations;
    }

    private void generateGraph() {
        // Initialize adjacency list
        adjList = new HashMap<>();
        for (String gene : posGenes) {
            adjList.put(gene, new ArrayList<>());
        }

        for (String gene : posGenes) {
            adjList.put(gene, generatePossibleMutations(gene));
        }
    }

    private int getShortestPath(String startGene, HashSet<String> endGenes) {

        ArrayDeque<String> queue = new ArrayDeque<>();
        HashMap<String, Integer> disArray = new HashMap<>();

        queue.addFirst(startGene);
        disArray.put(startGene, 0);

        while (!queue.isEmpty()) {
            String curGene = queue.getLast();
            queue.removeLast();
            if (endGenes.contains(curGene)) {
                return disArray.get(curGene);
            } else {
                int curDis = disArray.get(curGene);
                if (curDis < maxMutations) {
                    for (String connection : adjList.get(curGene)) {
                        if (!disArray.containsKey(connection)) {
                            disArray.put(connection, curDis + 1);
                            queue.addFirst(connection);
                        }
                    }
                }
            }
        }
        return -1;
    }

}
