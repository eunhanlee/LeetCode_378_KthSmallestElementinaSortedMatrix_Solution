class Solution {
    /**
     * Finds the Kth smallest element in the matrix.
     *
     * @param matrix The sorted matrix.
     * @param k      The order of the element to find (K).
     * @return The Kth smallest element.
     */
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int start = matrix[0][0];
        int end = matrix[n - 1][n - 1];

        // Use binary search to find the Kth smallest element
        while (start < end) {
            int mid = start + (end - start) / 2;
            int count = countLessOrEqualToMid(matrix, mid, n);

            if (count < k)
                start = mid + 1;
            else
                end = mid;
        }

        return start;
    }

    /**
     * Counts the number of elements less than or equal to the given mid value.
     *
     * @param matrix The sorted matrix.
     * @param mid    The mid value.
     * @param n      The size of the matrix (length of a row or column).
     * @return The count of elements less than or equal to mid.
     */
    private int countLessOrEqualToMid(int[][] matrix, int mid, int n) {
        int j = n - 1;  // Start from the last column
        int count = 0;

        for (int i = 0; i < n; i++) {
            // Find the first value greater than mid from the right side of the row
            while (j >= 0 && matrix[i][j] > mid) j--;
            // Accumulate the count of elements less than or equal to mid
            count += j + 1;
        }

        return count;
    }
}
