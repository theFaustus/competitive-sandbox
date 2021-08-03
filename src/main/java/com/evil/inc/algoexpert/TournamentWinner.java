package com.evil.inc.algoexpert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class TournamentWinner {
    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        final TreeMap<String, Integer> stringIntegerHashMap = new TreeMap<>();
        String winner = competitions.get(0).get(0);
        int currentWinnerScore = 0;
        for (int i = 0; i < competitions.size(); i++) {
            if(results.get(i) == 1){
                final Integer score = stringIntegerHashMap.merge(competitions.get(i).get(0), 3, (a1, a2) -> a1 += 3);
                if(score > currentWinnerScore){
                    winner = competitions.get(i).get(0);
                    currentWinnerScore = score;
                }
            } else {
                final Integer score = stringIntegerHashMap.merge(competitions.get(i).get(1), 3, (a1, a2) -> a1 += 3);
                if(score > currentWinnerScore){
                    winner = competitions.get(i).get(1);
                    currentWinnerScore = score;
                }
            }
        }

        return winner;
    }
}
