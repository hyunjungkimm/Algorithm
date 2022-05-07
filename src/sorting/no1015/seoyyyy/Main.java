package sorting.no1015.seoyyyy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] P;
    static int[] sortP;
    static int[][] cntArr;
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        P = new int[N];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(stk.nextToken());
        }
        sortP = P.clone();
        Arrays.sort(sortP);
        cntArr = new int[N][2];
        for (int i = 0; i < sortP.length; i++) {
            cntArr[i][0] = sortP[i];
            cntArr[i][1] = i;
        }

        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < sortP.length; j++) {
                if(P[i] == sortP[j]){
                    sj.add(String.valueOf(j));
                    sortP[j] = -1;
                    break;
                }
            }
        }
        System.out.println(sj);
    }


    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}
