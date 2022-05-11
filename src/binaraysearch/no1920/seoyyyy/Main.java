package binaraysearch.no1920.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public void solution(Set<Integer> A, int[] B){
        for (int num:B) {
            System.out.println(A.contains(num) ? 1 : 0);
        }
    }

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            Set<Integer> A = new HashSet<>();

            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A.add(Integer.parseInt(stk.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            int[] B = new int[M];

            stk = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(stk.nextToken());
            }

            Main main = new Main();
            main.solution(A, B);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
