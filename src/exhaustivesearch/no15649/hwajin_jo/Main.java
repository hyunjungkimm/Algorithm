package exhaustivesearch.no15649.hwajin_jo;

import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visited = new boolean[N + 1];

        solution(0);

        System.out.println(sb);
    }

    public static void solution(int depth) {

        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = 0; i < N; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    arr[depth] = i + 1;
                    solution(depth + 1);

                    visited[i] = false;
                }
            }
        }
    }
}
