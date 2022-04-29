package sorting.no11652.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] list = new long[N];
        for (int i = 0; i < N; i++) {
            list[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(list);

        int cnt = 1, maxofcnt = 1;
        long maxofnumber = list[0];
        for (int i = 1; i < N; i++) {
            if (list[i - 1] == list[i]) {
                cnt++;
            } else {
                cnt = 1;
            }

            // 갱신
            if (maxofcnt < cnt) {
                maxofcnt = cnt;
                maxofnumber = list[i];
            }

        }

        System.out.println(maxofnumber);
    }
}