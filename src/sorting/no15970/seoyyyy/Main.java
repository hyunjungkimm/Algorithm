package sorting.no15970.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N개의 색깔
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        Map<Integer, ArrayList> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            stk  = new StringTokenizer(br.readLine());
            int color = Integer.parseInt(stk.nextToken());
            int position = Integer.parseInt(stk.nextToken());

            // 키가 존재하지 않으면 리스트를 생성해준다.
            if(!map.containsKey(position)) map.put(position, new ArrayList());

            map.get(position).add(color);
        }

        Iterator iter = map.keySet().iterator();

        int sum = 0;
        ArrayList<Integer> list;
        while (iter.hasNext()){
            list = map.get(iter.next());
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {

                if(i == 0){ // 첫번째 위치이면
                    sum += Math.abs(list.get(i) - list.get(i + 1)); // 오른쪽 거리 더하기
                }else if(i == list.size()-1){ // 마지막 위치이면
                    sum += Math.abs(list.get(i) - list.get(i - 1)); // 왼쪽 거리 더하기
                }else{ // 그 외
                    int left = list.get(i - 1);
                    int right = list.get(i + 1);
                    int mine = list.get(i);
                    if(Math.abs(left - mine) < Math.abs(right - mine)){ // 왼쪽과의 거리와 오른쪽의 거리 비교
                        sum += Math.abs(mine - left); // 왼쪽의 거리를 더해준다.
                    }else{
                        sum += Math.abs(mine - right); // 오른쪽의 거리를 더해준다.
                    }
                }
            }
        }

        System.out.println(sum);

    }

    public static void main(String[] args) {

        try {
            Main m = new Main();
            m.solution();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

