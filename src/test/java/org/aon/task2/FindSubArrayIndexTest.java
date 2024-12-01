package org.aon.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindSubArrayIndexTest {

    @Test
    void testNormalSubArrayFound() {
        int[] mainArray = {4, 9, 3, 7, 8};
        int[] subArray = {3, 7};
        assertEquals(2, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }

    @Test
    void testSubArrayAtBeginning() {
        int[] mainArray = {1, 2, 3, 4, 5};
        int[] subArray = {1, 2};
        assertEquals(0, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }

    @Test
    void testSubArrayAtEnd() {
        int[] mainArray = {1, 2, 3, 4, 5};
        int[] subArray = {4, 5};
        assertEquals(3, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }

    @Test
    void testSubArrayNotFound() {
        int[] mainArray = {1, 2, 3, 4, 5};
        int[] subArray = {6, 7};
        assertEquals(-1, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }

    @Test
    void testEmptyMainArray() {
        int[] mainArray = {};
        int[] subArray = {1, 2};
        assertEquals(-1, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }

    @Test
    void testEmptySubArray() {
        int[] mainArray = {1, 2, 3, 4, 5};
        int[] subArray = {};
        assertEquals(0, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }

    @Test
    void testNullMainArray() {
        int[] mainArray = null;
        int[] subArray = {1, 2};
        assertEquals(-1, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }

    @Test
    void testNullSubArray() {
        int[] mainArray = {1, 2, 3, 4, 5};
        int[] subArray = null;
        assertEquals(-1, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }

    @Test
    void testSubArrayLongerThanMainArray() {
        int[] mainArray = {1, 2, 3};
        int[] subArray = {1, 2, 3, 4};
        assertEquals(-1, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }

    @Test
    void testMultipleOccurrences() {
        int[] mainArray = {1, 2, 3, 2, 3, 4, 5};
        int[] subArray = {2, 3};
        assertEquals(1, FindSubArrayIndex.findSubArrayIndex(mainArray, subArray));
    }
}
