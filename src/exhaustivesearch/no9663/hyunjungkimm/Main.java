package exhaustivesearch.no9663.hyunjungkimm;

import java.util.Scanner;

public class Main {
    static int N;
    static int[] chess;
    static int check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        chess = new int[N + 1];

        dfs(1);
        System.out.println(check);
    }

    public static void dfs(int row) {
        if (row > N) {
            check++;
            return;
        }

        for (int i = 1; i <= N; i++) {
            chess[row] = i;
            if (checking(row)) {
                dfs(row + 1);
            }
        }
    }

    private static boolean checking(int row) {
        for (int j = 1; j < row; j++) {
            if (chess[row] == chess[j] || Math.abs(chess[row] - chess[j]) == row - j) {
                return false;
            }
        }
        return true;
    }

}
