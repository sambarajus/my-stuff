package com.ssk.examples.ds.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class JourneyToMoonTest {

    private JourneyToMoon journeyToMoon = new JourneyToMoon();

    @Test
    public void numberOfPairs() throws Exception {
        int[][] pairs = journeyToMoon.numberOfPairs(5);
        for (int i = 0; i <pairs.length ; i++) {
            for (int j = 0; j < pairs[i].length; j++) {
                System.out.print(pairs[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Test
    public void uniquePairsToMoon() throws Exception{


        int n = 4;
        int p = 2;
        int[][] l = new int[p][2];
        l[0][0] = 0;
        l[0][1] = 2;

//        l[1][0] = 0;
//        l[1][1] = 2;

        int[][] pairs = journeyToMoon.uniquePairsToMoon(4,l);

        for (int i = 0; i <pairs.length ; i++) {
            for (int j = 0; j < pairs[i].length; j++) {
                System.out.print(pairs[i][j]+" ");
            }
            System.out.println();
        }
    }

}