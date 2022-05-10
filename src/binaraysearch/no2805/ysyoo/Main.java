package binaraysearch.no2805.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] list_of_tree;
    static int expected_length_of_tree;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // count
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num_of_tree = Integer.parseInt(st.nextToken());
        expected_length_of_tree = Integer.parseInt(st.nextToken()); // int (2000000000)

        // tree list
        list_of_tree = new int[num_of_tree + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num_of_tree; i++) {
            list_of_tree[i] = Integer.parseInt(st.nextToken());
        }

        // sort
        Arrays.sort(list_of_tree);

        // 시작점
        long left = 0;
        long right = list_of_tree[list_of_tree.length - 1];

        while (left <= right) {

            long mid = (left + right) / 2;

            long sum = calc_of_sum(mid);

            if (sum < expected_length_of_tree) {
                right = mid - 1;
            } else if (sum >= expected_length_of_tree) {
                left = mid + 1;
            }
        }

        System.out.println(right);

    }

    public static long calc_of_sum(long mid) {

        long sum = 0;
        for (int i = 0; i < list_of_tree.length; i++) {
            if (list_of_tree[i] > mid) {
                // 크다
                sum += list_of_tree[i] - mid;
            }
        }
        return sum;
    }
}
