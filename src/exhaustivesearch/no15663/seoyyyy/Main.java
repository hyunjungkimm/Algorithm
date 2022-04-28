package exhaustivesearch.no15663.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[] visit;
    static int[] intNumbers, result;
    static StringBuilder sb;
    static LinkedHashSet<String> set;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());

        visit = new boolean[N];
        intNumbers = new int[N];
        result = new int[M];
        set = new LinkedHashSet<>();

        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            intNumbers[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(intNumbers);
        printNumbers(0);

        for (String str:set) {
            System.out.println(str);
        }
    }

    public void printNumbers(int depth){
        if(depth == M){
            sb = new StringBuilder();

            for (int num:result) {
                sb.append(num).append(' ');
            }

            set.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if(visit[i]) continue;

            visit[i] = true;
            result[depth] = intNumbers[i];
            printNumbers(depth + 1 );
            visit[i] = false;
        }

    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }
}
