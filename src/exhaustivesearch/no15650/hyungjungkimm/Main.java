package exhaustivesearch.no15650.hyungjungkimm;

import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] out;
    static boolean[] visited;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        out = new int[M];
        visited = new boolean[N+1];

        combination(0, 1, out);
        System.out.println(sb);
    }

    private static void combination(int depth, int start, int[] out) {
        if(depth == M){
            for(int num : out) sb.append(num).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = start; i<=N; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = i;
                combination(depth+1, start+=1, out);
                visited[i] = false;
            }
        }
    }
}
