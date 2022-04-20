package exhaustivesearch.no15652.hyunjungkimm;
/*
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

        combination(0,1, out);
        System.out.println(sb);
    }

    private static void combination(int depth, int start, int[] out) {
        if(depth == M){
            for(int num : out) sb.append(num).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = start; i<=N; i++){
            out[depth] = i;
            combination(depth+1, i, out);
        }
    }
}*/

import java.util.*;


public class Main{
    static int N, M;
    static int[] out;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        out = new int[M];

        dfs(0, 1);
        System.out.println(sb);
    }

    private static void dfs(int depth, int start){
        if(depth == M){
            for(int num : out) sb.append(num).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = start; i<=N; i++){
            out[depth] = i;
            dfs(depth+1, i);
        }
    }


}