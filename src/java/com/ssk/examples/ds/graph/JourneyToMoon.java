package com.ssk.examples.ds.graph;

public class JourneyToMoon {

    private Graph graph;

    public int[][] uniquePairsToMoon(int n, int[][] astronaut){

        graph = new Graph(n);
        for (int i = 0; i <astronaut.length ; i++) {
            graph.addEdge(astronaut[i][0],astronaut[i][1] );
        }
        return astronaut;
    }

    public int[][] numberOfPairs(int N){

        int[][] pairs = new int[N][N];

        int uniquePairs = 0;
        for (int i = 0; i < N-1 ; i++) {
            for (int j = 0; j < N ; j++) {
                if(i!=j && isValidPair(i,j,pairs)){
                    pairs[i][j] = 1;
                    uniquePairs++;
                }
                else
                    pairs[i][j] = 0;
            }
        }
        System.out.println(uniquePairs);
        return pairs;
    }

    boolean isValidPair(int i, int j, int[][] pairs){
        if (pairs[j][i]==0)
            return true;
        else
            return false;
    }


}
