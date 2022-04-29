package sorting.no11652.hwajin_jo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        int cnt = 1, max = 1;
        long result = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i-1]) cnt++;
            else cnt = 1;

            if (max < cnt) {
                max = cnt;
                result = arr[i];
            }
        }

        System.out.println(result);
    }
}
