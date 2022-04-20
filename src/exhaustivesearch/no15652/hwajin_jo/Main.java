package exhaustivesearch.no15652.hwajin_jo;

import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];

        solution(1, 0);

        System.out.println(sb);
    }

    public static void solution(int start, int depth) {

        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = start; i <= N; i++) {
                arr[depth] = i;
                solution(i, depth + 1);
            }
        }
    }
}
