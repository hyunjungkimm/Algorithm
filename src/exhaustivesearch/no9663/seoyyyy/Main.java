package exhaustivesearch.no9663.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int N; // 행의 수
    public static int cnt; // 경우의수
    public static int[] chess;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) { // 한 행씩 내려가면서 체크
            chess = new int[N];
            chess[0] = i;
            nQueen(chess, 0);
        }
        System.out.print(cnt);

    }

    public static void nQueen(int[] chess, int col) {
        if (col == N - 1) {
            cnt++; // 경우의 수 증가
            return;
        }

        for (int i = 0; i < N; i++) {
            chess[col + 1] = i;
            if (check(chess, col + 1)) {
                nQueen(chess, col + 1);
            }
        }

    }

    public static boolean check(int[] chess, int col) {
        for (int i = 0; i < col; i++) {
            if (chess[i] == chess[col]) return false; // 같은 행 체크
            if (Math.abs(i - col) == Math.abs(chess[i] - chess[col])) return false; // 대각선 체크
        }
        return true;
    }

    public static void main(String[] args) {
        Main main = new Main();
        try{
            main.solution();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
