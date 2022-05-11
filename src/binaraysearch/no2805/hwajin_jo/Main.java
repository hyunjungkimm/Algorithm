package binaraysearch.no2805.hwajin_jo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 나무의 갯수
        long M = sc.nextLong(); // 필요한 나무의 길이
        int[] tree = new int[N];

        int min = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            tree[i] = sc.nextInt();

            if (max < tree[i]) {
                max = tree[i];
            }
        }

        Arrays.sort(tree);



        while (min < max) {
            int mid = (min + max) / 2;
            long sum = 0;

            for (int i = 0; i < N; i++) {
                if (tree[i] >= mid) {
                    sum += tree[i] - mid;
                }
            }

            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        System.out.println(min - 1);
    }
}
