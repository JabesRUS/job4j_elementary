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
}