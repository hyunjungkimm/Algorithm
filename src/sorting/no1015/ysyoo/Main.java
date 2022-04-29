package sorting.no1015.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine(), 10);
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Number> org = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            org.add(new Number(Integer.parseInt(st.nextToken()), i));
        }

        // 오름차순
        Collections.sort(org, new Comparator<Number>() {

            @Override
            public int compare(Number o1, Number o2) {
                if (o1.n == o2.n) {
                    if (o1.idx < o2.idx) {
                        return -1; // 오름차순
                    } else {
                        return 1;
                    }
                } else if (o1.n < o2.n) {
                    return -1; // 오름차순
                } else {
                    return 1;
                }
            }

        });

        // 50 <= p.length <= 1000
        int[] p = new int[1001];
        for (int i = 0; i < N; i++) {
            // ex) p[4] = i
            p[org.get(i).idx] = i; // sorting 한 위치값 = i
        }

        for (int i = 0; i < N; i++) {
            System.out.print(p[i] + " ");
        }
    }

    public static class Number {
        public int n, idx;

        public Number(int n, int idx) {
            this.n = n;
            this.idx = idx;
        }

        @Override
        public String toString() {
            return "Number [idx=" + idx + ", n=" + n + "]";
        }

    }
}
