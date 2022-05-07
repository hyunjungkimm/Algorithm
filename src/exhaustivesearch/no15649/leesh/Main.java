package exhaustivesearch.no15649.leesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] p;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int level) {
        if (level == m) {
            for (int elem : p) {
                sb.append(elem).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                if (!visit[i]) {
                    p[level] = i;
                    visit[i] = true;
                    dfs(level + 1);
                    visit[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        p = new int[m];
        visit = new boolean[n + 1];
        dfs(0);
        System.out.println(sb.toString());
    }
}
