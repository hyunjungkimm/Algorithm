package binaraysearch.no2110.hwajin_jo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N]; // 집들의 위치

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 1;
        int right = arr[N-1] - arr[0];
        int distance = 0;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int start = arr[0];
            int count = 1;

            for (int i = 0; i < N; i++) {
                distance = arr[i] - start;
                if (distance >= mid) { //만약 첫번째 집과의 거리가 더 크다면 찾았다고 count 올려주고, 내가 찾는집에 이번 집을 넣어준다.
                    count++;
                    start = arr[i];
                }
            }

            if (count >= C) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);

    }
}
