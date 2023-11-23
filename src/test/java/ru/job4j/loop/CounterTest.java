package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void sum() {
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void WhenSumEvenNumbers1To100Then2550() {
        int start = 1;
        int finish = 100;
        int result = Counter.sumByEven(start, finish);
        int expected = 2550;
        assertThat(result).isEqualTo(expected);
    }
}