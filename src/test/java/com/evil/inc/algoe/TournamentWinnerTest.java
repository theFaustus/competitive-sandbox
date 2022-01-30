package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TournamentWinnerTest {

    @Test
    public void tournamentWinner() {
        final ArrayList<String> list1 = new ArrayList<>(Arrays.asList("HTML", "C#"));
        final ArrayList<String> list2 = new ArrayList<>(Arrays.asList("C#", "Python"));
        final ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        final ArrayList<ArrayList<String>> competitions = new ArrayList<>(Arrays.asList(list1, list2, list3));
        final ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

        Assertions.assertThat(TournamentWinner.tournamentWinner(competitions, results)).isEqualTo("Python");
    }

    @Test
    public void tournamentWinner2() {
        final ArrayList<String> list1 = new ArrayList<>(Arrays.asList("HTML", "C#"));
        final ArrayList<String> list2 = new ArrayList<>(Arrays.asList("C#", "Python"));
        final ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        final ArrayList<ArrayList<String>> competitions = new ArrayList<>(Arrays.asList(list1, list2, list3));
        final ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(1, 0, 0));

        Assertions.assertThat(TournamentWinner.tournamentWinner(competitions, results)).isEqualTo("HTML");
    }
}
