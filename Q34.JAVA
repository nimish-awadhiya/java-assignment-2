import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};

        // Create a new array to hold merged values
        int[] C = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;

        // Merge arrays A and B into array C
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // If there are remaining elements in A
        while (i < A.length) {
            C[k++] = A[i++];
        }

        // If there are remaining elements in B
        while (j < B.length) {
            C[k++] = B[j++];
        }

        // Print the merged sorted array
        System.out.println("Merged Array: " + Arrays.toString(C));
    }
}
