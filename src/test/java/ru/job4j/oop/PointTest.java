package ru.job4j.oop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;


public class PointTest {

    @Test
    public void when22to44then2dot82() {
        Point a = new Point(2, 4);
        Point b = new Point(4, 2);
        double expected = 2.82;
        double result = a.distance(b);
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when45to34then1dot41() {
        Point a = new Point(4, 5);
        Point b = new Point(3, 4);
        double expected = 1.41;
        double result = a.distance(b);
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when33to53then2() {
        Point a = new Point(3, 3);
        Point b = new Point(5, 3);
        double expected = 2;
        double result = a.distance(b);
        assertThat(result).isCloseTo(expected, offset(0.01));

    }

    @Test
    public void when77to78then1() {
        Point a = new Point(7, 7);
        Point b = new Point(7, 8);
        double expected = 1;
        double result = a.distance(b);
        assertThat(result).isCloseTo(expected, offset(0.01));
    }
}


