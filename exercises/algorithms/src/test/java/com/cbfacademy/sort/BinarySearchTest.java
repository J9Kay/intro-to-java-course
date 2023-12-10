package com.cbfacademy.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int result = binarySearch.search(arr, 5);
        assertEquals(4, result);
        System.out.println("Test for value 5 passed. Expected index: 4, Found index: " + result);

        result = binarySearch.search(arr, 10);
        assertEquals(-1, result);
        System.out.println("Test for value 10 passed. Expected index: -1 (not found), Found index: " + result);
    }
}
