package exhaustivesearch.no15650.hwajin_jo;

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

    public static void solution(int at, int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = at; i <= N; i++) {
                arr[depth] = i;
                solution(i+1, depth+1);
            }
        }
    }
}
