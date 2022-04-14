package exhaustivesearch.no14888.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int i = 0;
        while (stk.hasMoreTokens()){
            arr[i] = Integer.parseInt(stk.nextToken());
            i ++;
        }

        int[] arith = new int[4];
        i = 0;
        stk = new StringTokenizer(br.readLine());
        while(stk.hasMoreTokens()){
            arith[i] = Integer.parseInt(stk.nextToken());
            i ++;
        }

    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}