package org.aon.task2;

public class FindSubArrayIndex {
    /**
     * Finds the starting index where the second array occurs as a sub-array in the first array.
     *
     * @param mainArray The array to search in
     * @param subArray The sub-array to find
     * @return The starting index of the sub-array, or -1 if not found
     */
    public static int findSubArrayIndex(int[] mainArray, int[] subArray) {
        // Handle edge cases
        if (mainArray == null || subArray == null) {
            return -1;
        }

        if (subArray.length > mainArray.length) {
            return -1;
        }

        if (subArray.length == 0) {
            return 0;
        }

        // Iterate through possible starting positions
        for (int i = 0; i <= mainArray.length - subArray.length; i++) {
            // Check if sub-array matches at current position
            boolean found = true;
            for (int j = 0; j < subArray.length; j++) {
                if (mainArray[i + j] != subArray[j]) {
                    found = false;
                    break;
                }
            }

            // If match found, return the starting index
            if (found) {
                return i;
            }
        }

        // Sub-array not found
        return -1;
    }
}
