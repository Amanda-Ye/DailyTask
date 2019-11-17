//已知数组A[0,1,2,...n - 1],求数组B[0,1,2,...n - 1]
//B[i] = A[0]*A[1]*...* A[i - 1]*A[i + 1] *...*A[n - 1]

public class MultiArray {
    public static int[] multiply(int[] A) {
        if (A == null) {
            return null;
        }
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = 1;
            for (int j = 0; j < A.length; j++) {
                if (j != i) {
                    B[i] *= A[j];
                }
            }
        }
        return B;
    }
}