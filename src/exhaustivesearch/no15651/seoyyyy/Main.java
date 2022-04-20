package exhaustivesearch.no15651.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        printNumbers("", n, m);
    }

    public void printNumbers(String str, int n, int m){
        if(m > 1){
            for (int i = 1; i <= n; i++) {
                printNumbers(joinStrNum(str, i), n, m - 1);
            }
            return;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(joinStrNum(str, i)).append("\n");
        }
        System.out.print(result);
    }

    public String joinStrNum(String str, int strNum){
        return (str + " " + strNum).trim();
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
