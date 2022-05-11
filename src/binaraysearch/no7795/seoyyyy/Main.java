package binaraysearch.no7795.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
2
5 3
8 1 7 3 1
3 6 1
3 4
2 13 7
103 11 290 215
 */
public class Main {
    public void solution(int[] A, int[] B){
        Arrays.sort(B);

        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i] > B[j]){
                    cnt ++;
                }else{
                    break;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        StringTokenizer stk;

        for (int i = 0; i < T; i++) {
            stk = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(stk.nextToken());  // A의 수
            int M = Integer.parseInt(stk.nextToken());  // B의 수

            int[] A = new int[N];
            int[] B = new int[M];

            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < A.length; j++) {
                A[j] = Integer.parseInt(stk.nextToken());
            }

            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < B.length; j++) {
                B[j] = Integer.parseInt(stk.nextToken());
            }

            main.solution(A, B);

        }
    }
}
