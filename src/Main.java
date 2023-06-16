class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();


        int[][] matrix1 = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };

// Sorted List: [1, 5, 9, 10, 11, 12, 13, 13, 15]
        assert tt.kthSmallest(matrix1, 8) == 13;
        assert tt.kthSmallest(matrix1, 1) == 1;

        int[][] matrix2 = {
                {1, 2},
                {3, 4}
        };

// Sorted List: [1, 2, 3, 4]
        assert tt.kthSmallest(matrix2, 4) == 4;
        assert tt.kthSmallest(matrix2, 6) == 6;

        int[][] matrix3 = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

// Sorted List: [1, 3, 5, 7, 9, 11, 13, 15, 17]
        assert tt.kthSmallest(matrix3, 9) == 17;
        assert tt.kthSmallest(matrix3, 2) == 3;

        int[][] matrix4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

// Sorted List: [1, 2, 3, 4, 5, 6, 7, 8, 9]
        assert tt.kthSmallest(matrix4, 5) == 5;
        assert tt.kthSmallest(matrix4, 9) == 9;

        int[][] matrix5 = {
                {10, 20, 30},
                {15, 25, 35},
                {27, 29, 37}
        };
// Sorted List: [10, 15, 20, 25, 27, 29, 30, 35, 37]
        assert tt.kthSmallest(matrix5, 4) == 20;
        assert tt.kthSmallest(matrix5, 7) == 27;

        int[][] matrix6 = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };
// Sorted List: [2, 4, 6, 8, 10, 12, 14, 16, 18]
        assert tt.kthSmallest(matrix6, 3) == 6;
        assert tt.kthSmallest(matrix6, 6) == 12;

        int[][] matrix7 = {
                {3, 6, 9, 12},
                {15, 18, 21, 24},
                {27, 30, 33, 36},
                {39, 42, 45, 48}
        };
// Sorted List: [3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48]
        assert tt.kthSmallest(matrix7, 8) == 24;
        assert tt.kthSmallest(matrix7, 12) == 30;

        int[][] matrix8 = {
                {4}
        };
// Sorted List: [4]
        assert tt.kthSmallest(matrix8, 1) == 4;

        int[][] matrix9 = {
                {5, 5, 5},
                {5, 5, 5},
                {5, 5, 5}
        };
// Sorted List: [5, 5, 5, 5, 5, 5, 5, 5, 5]
        assert tt.kthSmallest(matrix9, 5) == 5;
        assert tt.kthSmallest(matrix9, 9) == 5;

        int[][] matrix10 = {
                {100}
        };
// Sorted List: [100]
        assert tt.kthSmallest(matrix10, 1) == 100;

        int[][] matrix11 = {
                {3, 6, 9, 12},
                {4, 18, 9, 24},
                {5, 6, 33, 36},
                {6, 42, 33, 33}
        };
// Sorted List: [3, 4, 6, 6, 9, 9, 12, 18, 24, 33, 33, 33, 36, 42]
        assert tt.kthSmallest(matrix11, 4) == 6;
        assert tt.kthSmallest(matrix11, 5) == 6;
        assert tt.kthSmallest(matrix11, 6) == 6;
        assert tt.kthSmallest(matrix11, 7) == 9;
        assert tt.kthSmallest(matrix11, 14) == 33;
        assert tt.kthSmallest(matrix11, 15) == 36;

        System.out.println("All test cases passed.");
    }
}
