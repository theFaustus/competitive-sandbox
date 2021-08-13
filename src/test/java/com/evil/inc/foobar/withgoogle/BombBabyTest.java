package com.evil.inc.foobar.withgoogle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BombBabyTest {

    @Test
    public void solution() {
        Assertions.assertThat(BombBaby.solution("2", "1")).isEqualTo("1");
    }


    @Test
    public void solution2() {
        Assertions.assertThat(BombBaby.solution("4", "7")).isEqualTo("4");
    }


    @Test
    public void solution3() {
        Assertions.assertThat(BombBaby.solution("44567", "7678")).isEqualTo("36");
    }

    @Test
    public void solution4() {
        Assertions.assertThat(BombBaby.solution("7678", "7678")).isEqualTo("impossible");
    }

    @Test
    public void solution5() {
        Assertions.assertThat(BombBaby.solution("7678", "44567")).isEqualTo("36");
    }

    @Test
    public void solution6() {
        Assertions.assertThat(BombBaby.solution("234667554367", "234523456")).isEqualTo("1086");
    }

    @Test
    public void solution7() {
        Assertions.assertThat(BombBaby.solution("23466755", "234667554367")).isEqualTo("15397");
    }
}