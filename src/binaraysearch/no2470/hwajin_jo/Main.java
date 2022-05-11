package binaraysearch.no2470.hwajin_jo;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);


        int[] result = new int[2];

        int start = 0;
        int end = N-1;

        int zero = 0;

        long min = 2000000000;

        while (start < end) {
            long sum = A[start] + A[end];

            if (Math.abs(sum) == zero) {
                result[0] = A[start];
                result[1] = A[end];
                break;
            }


            // 두 용액 갱신
            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                result[0] = A[start];
                result[1] = A[end];
            }

            if (sum > 0) {
                end--;
            } else {
                start++;
            }
        }


        bw.write(result[0] + " " + result[1] + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
