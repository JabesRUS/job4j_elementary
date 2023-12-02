package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1to2then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(expected).isEqualTo(result);

    }

    @Test
    void whenMax5to2then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(expected).isEqualTo(result);

    }

    @Test
    void whenMax5to20then20() {
        int left = 5;
        int right = 20;
        int result = Max.max(left, right);
        int expected = 20;
        assertThat(expected).isEqualTo(result);

    }

    @Test
    void whenMax5to5then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(expected).isEqualTo(result);

    }

    @Test
    void whenMax5to5to6then6() {
        int a = 5;
        int b = 5;
        int c = 6;
        int result = Max.max(a, b, c);
        int expected = 6;
        assertThat(expected).isEqualTo(result);

    }

    @Test
    void whenMaxMinus1to10to1then10() {
        int a = -1;
        int b = 10;
        int c = 1;
        int result = Max.max(a, b, c);
        int expected = 10;
        assertThat(expected).isEqualTo(result);

    }

    @Test
    void whenMax1to2to3to4then4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertThat(expected).isEqualTo(result);

    }

    @Test
    void whenMax0to0to0to0then0() {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int result = Max.max(a, b, c, d);
        int expected = 0;
        assertThat(expected).isEqualTo(result);

    }
}