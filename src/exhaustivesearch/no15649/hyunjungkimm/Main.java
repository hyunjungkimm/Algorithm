package exhaustivesearch.no15649.hyunjungkimm;

import java.util.Scanner;

/*public class Main {
    static int N,M;
    static int[] out;
    static boolean[] visited;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        out = new int[M];
        visited = new boolean[N+1];

        permutation(0,out);
        System.out.println(sb);

    }

    private static void permutation(int depth,int[] out) {
        if(depth == M){
            for(int num: out) sb.append(num).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = 1; i<=N; i++) {
            if(!visited[i]){
                visited[i] = true;
                out[depth] = i;
                permutation(depth + 1, out);
                visited[i] = false;
            }
        }
    }
}*/
public class Main{
    static int N,M;
    static int[] out;
    static StringBuffer sb = new StringBuffer();
    static boolean[] visited;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        out = new int[M];
        visited = new boolean[N];

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth){
        if(M == depth){
            for(int num : out){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = i+1;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}