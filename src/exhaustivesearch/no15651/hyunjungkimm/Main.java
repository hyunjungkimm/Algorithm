package exhaustivesearch.no15651.hyunjungkimm;

import java.util.Scanner;

public class Main {
    static int N, M;
    static StringBuffer sb = new StringBuffer();
    static int[] out;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        out = new int[M];

        permutation(out,0);
        System.out.println(sb);
    }

    private static void permutation(int[] out ,int depth) {
        if(depth == M){
            for(int num : out) sb.append(num).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = 1; i<=N; i++){
            out[depth] = i;
            permutation(out,depth+1);
        }

    }
}

/*
시간초과
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }

        permutation(arr, new int[M], 0, M);


    }

    private static void permutation(int[] arr, int[] out, int depth, int M) {
       if(depth == M){
           for(int num: out) System.out.print(num + " ");
           System.out.println();
           return;
       }
       for(int i= 0; i<arr.length; i++){
           out[depth] = arr[i];
           permutation(arr, out, depth+1, M);
       }
    }

}*/
