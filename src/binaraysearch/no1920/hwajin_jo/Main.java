package binaraysearch.no1920.hwajin_jo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int M = sc.nextInt();
        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }


        int[] result = new int[M];

        for (int i = 0; i < M; i++) {
            int start = 0;
            int end = N - 1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (B[i] == A[mid]) {
                    result[i] = 1;
                    start = mid + 1;
                } else if (B[i] > A[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }


        for (int i = 0; i < M; i++) {
            System.out.println(result[i]);
        }
    }
}
