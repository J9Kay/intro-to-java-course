package com.cbfacademy.sort;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertEquals(4, binarySearch.search(arr, 5)); // Index of 5 in the array
        assertEquals(-1, binarySearch.search(arr, 10)); // 10 is not in the array
    }
}
