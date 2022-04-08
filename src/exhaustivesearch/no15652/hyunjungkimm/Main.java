package exhaustivesearch.no15652.hyunjungkimm;

import java.util.Scanner;

public class Main {
    static int N,M;
    static int[] out;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        out = new int[M];

        permutation(0,1, out);
        System.out.println(sb);
    }

    private static void permutation(int depth, int start, int[] out) {
        if(depth == M){
            for(int num : out) sb.append(num).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = start; i<=N; i++){
            out[depth] = i;
            permutation(depth+1, i, out);
        }
    }
}
