package exhaustivesearch.no15650.leesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] c;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int level, int start) {
        if (level == m) {
            for (int elem : c) {
                sb.append(elem).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = start; i <= n; i++) {
                c[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        c = new int[m];
        dfs(0, 1);
        System.out.println(sb.toString());
    }
}
