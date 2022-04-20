package exhaustivesearch.no1882.hwajin_jo;

import java.util.Scanner;

public class Main {

    static int N, S;
    static int[] number;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();

        number = new int[N];

        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt();
        }

        solution(0, 0);

        if (S == 0) { // 공집합일 경우 -1 빼줌
            System.out.println(cnt-1);
        } else {
            System.out.println(cnt);
        }
    }

    public static void solution(int depth, int total) {

        if (depth == N) {
            if (total == S) {
                cnt++;
            }
            return;
        }

        solution(depth + 1, total + number[depth]); // 현재 값 더해줌
        solution(depth + 1, total); // 현재 값 더하지 않음
    }
}
