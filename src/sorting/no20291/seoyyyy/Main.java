package sorting.no20291.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public void solution(Map<String, Integer> map){
        String[] keys = map.keySet().toArray(new String[map.size()]);
        Arrays.sort(keys);

        for (String key: keys) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                String[] str = br.readLine().split("\\.");
                String ext = str[1];
                map.put(ext, map.getOrDefault(ext, 0) + 1);
            }

            Main m = new Main();
            m.solution(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


