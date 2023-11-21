package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class FitTest {

    @Test
    void whenMan180That92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void when160WomanThat60() {
        short in = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(in);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }
}