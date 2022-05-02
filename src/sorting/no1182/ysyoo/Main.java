package sorting.no1182.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int n, s, count = 0;
    public static int[] list;

    public static void main(String[] args) throws IOException {

        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        // set
        st = new StringTokenizer(br.readLine());
        list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        // System.out.println(Arrays.toString(list));

        dfs(0, 0);
        // ㅠㅠ 엄청 헤맸당 ㅠㅠ
        if (s == 0)
            count -= 1;
        System.out.println(count);
    }

    public static void dfs(int point, int sum) {

        if (n == point) {
            // 끝에 도달 해서, 결과가 s 와 같으면
            if (s == sum) {
                count++;
            }
            return;
        }

        dfs(point + 1, sum + list[point]);
        dfs(point + 1, sum);
    }
}