package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void when22to44then2dot82() {
        Point a = new Point(2, 2);
        Point b = new Point(4, 4);
        double expected = 2.82;
        double out = a.distance(b);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void when33to66then4dot24() {
        Point a = new Point(3, 3);
        Point b = new Point(6, 6);
        double expected = 4.24;
        double out = a.distance(b);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void when12to21then1dot41() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 1);
        double expected = 1.41;
        double out = a.distance(b);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void when00to00then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0;
        double out = a.distance(b);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void when000to000then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double expected = 0;
        double out = a.distance3d(b);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void when123to456then5Dot19() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double expected = 5.19;
        double out = a.distance3d(b);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }

    @Test
    void whenMinus123to456then6Dot55() {
        Point a = new Point(-1, 2, 3);
        Point b = new Point(4, 5, 6);
        double expected = 6.55;
        double out = a.distance3d(b);
        assertThat(expected).isEqualTo(out, withPrecision(0.01));
    }
}