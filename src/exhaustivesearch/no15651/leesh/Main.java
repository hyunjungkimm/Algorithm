package exhaustivesearch.no15651.leesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] p;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int level) {
        if (level == m) {
            for (int elem : p) {
                sb.append(elem).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                p[level] = i;
                dfs(level + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        HashSet<int[]> set = new HashSet<>();
        set.add(new int[]{1, 2, 3});
        set.add(new int[]{1, 2, 4});

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        p = new int[m];
        dfs(0);
        System.out.println(sb.toString());
    }
}
