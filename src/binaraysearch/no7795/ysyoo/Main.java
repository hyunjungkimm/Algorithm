package binaraysearch.no7795.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int icase = Integer.parseInt(br.readLine());

        // case
        for (int k = 0; k < icase; k++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // init
            st = new StringTokenizer(br.readLine());
            int[] array_n = new int[n];
            for (int i = 0; i < n; i++) {
                array_n[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            int[] array_m = new int[m];
            for (int j = 0; j < m; j++) {
                array_m[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(array_m);

            // cal
            int count = 0;
            for (int i = 0; i < n; i++) {

                int left = 0;
                int right = array_m.length - 1;
                int pointer = -1;

                // 이진탐색이 빠르니까...
                while (left <= right) {
                    // left랑 right가 같아지면 끝난다. 
                    int mid = (left + right) / 2;

                    if (array_m[mid] < array_n[i]) {
                        pointer = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

                // pointer index가 0 이므로, count 값이 되기 위해 1 추가, pointer 값 까지, 기준값보다 작은 값
                count += pointer + 1;
            }

            System.out.println(count);
        }

    }

}
