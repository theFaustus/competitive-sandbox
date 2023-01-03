package com.evil.inc.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteColumnsTest {

    @Test
    public void solve() {
        DeleteColumns deleteColumns = new DeleteColumns();

        Assertions.assertThat(deleteColumns.solve(new String[]{"cba", "daf", "ghi"})).isEqualTo(1);
        Assertions.assertThat(deleteColumns.solve(new String[]{"a", "b"})).isEqualTo(0);
        Assertions.assertThat(deleteColumns.solve(new String[]{"zyx", "wvu", "tsr"})).isEqualTo(3);
        Assertions.assertThat(deleteColumns.solve(new String[]{"rrjk","furt","guzm"})).isEqualTo(2);
    }

    @Test
    public void solve2() {
        DeleteColumns deleteColumns = new DeleteColumns();

        Assertions.assertThat(deleteColumns.solve2(new String[]{"cba", "daf", "ghi"})).isEqualTo(1);
        Assertions.assertThat(deleteColumns.solve2(new String[]{"a", "b"})).isEqualTo(0);
        Assertions.assertThat(deleteColumns.solve2(new String[]{"zyx", "wvu", "tsr"})).isEqualTo(3);
        Assertions.assertThat(deleteColumns.solve2(new String[]{"rrjk","furt","guzm"})).isEqualTo(2);
    }
}
