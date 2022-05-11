package binaraysearch.no1764.seoyyyy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken()); // 듣도 못한 사람의 수
        int M = Integer.parseInt(stk.nextToken()); // 보도 못한 사람의 수

        Map<String, Integer> noHeardAndSeen = new TreeMap<>();
        int total = 0;
        for (int i = 0; i < N+M; i++) {
            String name = br.readLine();
            int cnt = noHeardAndSeen.getOrDefault(name, 0) + 1;
            if(cnt == 2) total ++;

            noHeardAndSeen.put(name, cnt);
        }
        System.out.println(total);
        for (String name: noHeardAndSeen.keySet()){
            if(noHeardAndSeen.get(name) == 2){
                System.out.println(name);
            }
        }


    }
    public static void main(String[] args) {
        try{
            Main main = new Main();
            main.solution();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
