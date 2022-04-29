package sorting.no11652.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    int max = -1;

    static Map<Long, Integer> cardMap = new HashMap<>();
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            Long  num = Long.parseLong(br.readLine());
            int cnt = cardMap.getOrDefault(num,0);
            cardMap.put(num, cnt + 1);

            if(cardMap.get(num) > max){
                max = cardMap.get(num);
            }
        }

        Long[] cardArr = cardMap.keySet().toArray(new Long[0]);
        System.out.println(Arrays.toString(cardArr));
        Arrays.sort(cardArr);

        for (Long key:cardArr) {
            if(cardMap.get(key).equals(max)){
                System.out.print(key);
                break;
            }
        }
    }



    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }

}