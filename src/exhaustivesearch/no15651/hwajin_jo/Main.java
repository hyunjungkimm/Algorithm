package exhaustivesearch.no15651.hwajin_jo;

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

        solution(0);
        System.out.println(sb);

    }

    public static void solution(int depth) {

        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]+ " ");
            }
            sb.append('\n');
        } else {
            for (int i = 1; i <= N; i++) {
                arr[depth] = i;
                solution(depth+1);
            }
        }


    }
}
