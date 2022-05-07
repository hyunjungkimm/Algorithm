package exhaustivesearch.no9663.hwajin_jo;

import java.util.Scanner;

public class Main {

    static int N;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];

        solution(0);

        System.out.println(count);

    }

    public static void solution(int depth) {

        // 모든 원소를 다 채운 상태이면 count 증가 및 return
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;

            // 놓을 수 있는 위치일 경우 다음 행으로 재귀호출
            if (isChecked(depth)) {
                solution(depth + 1);
            }
        }
    }

    public static boolean isChecked(int col) {

        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) return false; // 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재 할 경우) false를 리턴
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false; // 대각선상에 존재할 경우 false
        }
        return true;
    }
}
