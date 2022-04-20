package exhaustivesearch.no15663.hwajin_jo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        result = new int[M];

        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        solution(0);

        System.out.println(sb);
    }

    public static void solution(int depth) {

        if (depth == M) {
            StringBuilder sb2 = new StringBuilder();

            for (int i = 0; i < M; i++) {
                sb2.append(result[i]).append(' ');
            }
            if (!set.contains(sb2.toString())) { // 중복제거
                sb.append(sb2.toString()).append('\n');
                set.add(sb2.toString());
            }
            return;
        } else {
            for (int i = 0; i < N; i++) {
                if (!visited[i]) { // 방문하지 않았다면
                    visited[i] = true; // 방문 처리 후
                    result[depth] = arr[i]; // 해당 노드에 값을 넣음
                    solution(depth + 1); // 재귀 호출
                    visited[i] = false;
                }
            }
        }
    }
}
