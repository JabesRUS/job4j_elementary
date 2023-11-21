package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));

    }

    @Test
    void when22to44then2dot82() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 4;
        int y2 = 4;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));

    }

    @Test
    void when33to66then4dot24() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 6;
        int y2 = 6;
        double expected = 4.24;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));

    }

    @Test
    void when12to21then1dot41() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 1;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));

    }

    @Test
    void when00to00then0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));

    }
}