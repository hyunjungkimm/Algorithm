package binaraysearch.no2470.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] list;

    public static void main(String[] args) throws NumberFormatException, IOException {

        // 혼합 : 두 용액의 합 -> 0에 가까운 용액을 만들자
        // ex) -2 -4 -99 -1 98 -> 98 -99 = -1 (0에 가깝다!)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // count
        int count = Integer.parseInt(br.readLine());
        list = new int[count];

        // origin list
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        // -99 -2 -1 1 4 98
        Arrays.sort(list);

        int left = 0;
        int right = list.length - 1;

        int min_dist = 1000000000 * 2;
        int ans_left = list[left];
        int ans_right = list[right];
        while (left < right) {

            // 조건
            int sum = list[left] + list[right];
            int dist = Math.abs(sum);
            if (min_dist > dist) {
                min_dist = dist;
                ans_left = list[left];
                ans_right = list[right];
            }

            if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println(ans_left + " " + ans_right);
    }

}
