package sorting.no20291.hwajin_jo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            String[] data = str.split("\\."); // data[0] = sbrus, data[1] = txt로 split
            if (map.containsKey(data[1])) {
                int cnt = map.get(data[1]);
                map.replace(data[1], ++cnt);
            } else {
                map.put(data[1], 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
