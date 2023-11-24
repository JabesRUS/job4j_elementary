package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {1, 0, 0, 0, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 0, 0, 0, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {-1, 99, -56};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-56, -1, 99};
        assertThat(result).containsExactly(expected);
    }

}