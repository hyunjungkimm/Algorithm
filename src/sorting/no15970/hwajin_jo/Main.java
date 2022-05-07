package sorting.no15970.hwajin_jo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt(); // location
            arr[i][1] = sc.nextInt(); // color
        }

        // 색별로 좌표값 정렬
        Arrays.sort(arr, (i, j) -> {
            if (i[1] == j[1]) {
                return i[0] - j[0];
            } else {
                return i[1] - j[1];
            }
        });


        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (i == N - 1) { // 마지막 점일때
                result[i] = arr[i][0] - arr[i - 1][0]; // 왼쪽 점과의 거리 저장 -> 3 ( 4 - 1 )
            } else if (i == 0) { // 첫번쨰 점일때
                result[i] = arr[i + 1][0] - arr[i][0]; // 오른쪽 과의 거리 저장 -> 3 ( 3 - 0 )
            } else {
                int tmp1 = Math.abs(arr[i][0] - arr[i - 1][0]); // 왼쪽 점과의 거리
                int tmp2 = Math.abs(arr[i + 1][0] - arr[i][0]); // 오른쪽 점과의 거리

                if (arr[i][1] == arr[i - 1][1] && arr[i][1] == arr[i + 1][1]) { // 왼쪽과 오른쪽 같은 색
                    result[i] = tmp1 < tmp2 ? tmp1 : tmp2; // 더 작은 값을 저장
                } else if (arr[i][1] == arr[i + 1][1] && arr[i][1] != arr[i - 1][1]) { // 오른쪽만 같은색
                    result[i] = tmp2;
                } else { // 왼쪽만 같은 색
                    result[i] = tmp1;
                }
            }
        }

        for (int x : result) {
            sum += x;
        }

        System.out.println(sum);
    }
}
