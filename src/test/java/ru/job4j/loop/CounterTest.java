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
    void WhenSumEvenNumbersFiveToTwentyThenHundredFour() {
        int start = 5;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 104;
        assertThat(result).isEqualTo(expected);
    }
}