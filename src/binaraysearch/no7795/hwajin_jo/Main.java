package binaraysearch.no7795.hwajin_jo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int N,M,T;
    public static int[] A;
    public static int[] B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            N = sc.nextInt();
            M = sc.nextInt();

            A = new int[N];
            B = new int[M];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);

            for (int i = 0; i < M; i++) {
                B[i] = sc.nextInt();
            }

            Arrays.sort(B);

            int result = 0;

            for (int i = 0; i < N; i++) {
                int cnt = 0;
                int start = 0;
                int end = M - 1;

                while (start <= end) {
                    int mid = (start + end) / 2;

                    if (A[i] > B[mid]) {
                        cnt = mid + 1;
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                result += cnt;
            }
            System.out.println(result);
        }

    }
}
