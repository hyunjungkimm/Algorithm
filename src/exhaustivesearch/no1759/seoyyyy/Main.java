package exhaustivesearch.no1759.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int L,C;
    static String[] alphabet;
    static boolean[] visited;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        L = Integer.parseInt(stk.nextToken());
        C = Integer.parseInt(stk.nextToken());
        visited = new boolean[C];
        alphabet = br.readLine().split(" ");
        Arrays.sort(alphabet);

        makeKey(0,0);
    }

    public static void makeKey(int depth, int idx){
        if(idx == L) {
            StringBuilder sb = new StringBuilder();
            int moeum = 0, zaum = 0;
            for (int i = 0; i < C; i++) {
                if(visited[i]){
                    sb.append(alphabet[i]);
                    if(checkStr(alphabet[i])){
                        moeum ++;
                    }else{
                        zaum ++;
                    }
                }
            }

            if(moeum >= 1 && zaum >= 2){
                System.out.println(sb);
            }

            return;
        }

        for (int i = depth; i < alphabet.length; i++) {
            visited[i] = true;
            makeKey(i + 1, idx + 1);
            visited[i] = false;
        }

    }
    // 모음인지 아닌지 체크
    public static boolean checkStr(String key){
        if (key.equals("a")|| key.equals("e") || key.equals("i") || key.equals("o") || key.equals("u")){
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();

    }
}
