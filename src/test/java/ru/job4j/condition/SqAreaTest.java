package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void whenP10K4square4() {
        double expected = 4;
        int p = 10;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void whenP30K24square8dot64() {
        double expected = 8.64;
        int p = 30;
        double k = 24;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}