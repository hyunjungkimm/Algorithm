package exhaustivesearch.no14888.hwajin_jo;

import java.util.Scanner;

public class Main {
    static int N; // 숫자 갯수
    static int[] arr; // 숫자
    static int[] operator; // 연산자
    static int min = Integer.MAX_VALUE; // 최솟값
    static int max = Integer.MIN_VALUE; // 최댓값

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        operator = new int[4];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();
        }

        solution(arr[0], 1);

        System.out.println(max);
        System.out.println(min);

    }

    public static void solution(int num, int depth) {

        if (depth == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;
                switch(i) {
                    case 0 : solution(num + arr[depth], depth + 1);
                        break;
                    case 1: solution(num - arr[depth], depth + 1);
                        break;
                    case 2: solution(num * arr[depth], depth + 1);
                        break;
                    case 3: solution(num / arr[depth], depth + 1);
                        break;
                }

                operator[i]++;
            }

        }
    }
}
