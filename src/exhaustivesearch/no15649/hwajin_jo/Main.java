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
        visited = new boolean[N];

        solution(0);
        System.out.println(sb);
    }

    public static void solution(int depth) {

        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = 0; i < N; i++) {
                if (!visited[i]) { // 만약 해당 노드를 아직 방문하지 않았다면
                    visited[i] = true; // 해당 노드를 방문처리 한다.
                    arr[depth] = i + 1; // 해당 깊이를 인덱스로 하여 i값 저장
                    solution(depth + 1); // 다음 자식 노드 방문을 위해 depth + 1을 재귀호출

                    visited[i] = false;
                }
            }
        }
    }
}
