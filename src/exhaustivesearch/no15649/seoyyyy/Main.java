package exhaustivesearch.no15649.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    StringBuilder sb = new StringBuilder();
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] arr = new int[m];
        printNumbers(arr, n, 0);
        System.out.println(sb);
    }

    public void printNumbers(int[] arr, int n, int depth){
        if(depth == arr.length){
            for (int num: arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            printNumbers(arr, n, depth + 1);
        }


    }

    public static void main(String[] args) {
        try {
            Main m = new Main();
            m.solution();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

