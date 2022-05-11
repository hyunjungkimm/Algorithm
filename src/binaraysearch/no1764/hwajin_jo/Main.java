package binaraysearch.no1764.hwajin_jo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        ArrayList<String> result = new ArrayList<>();

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            String tmp = sc.next();
            if (set.contains(tmp)) {
                cnt++;
                result.add(tmp);
            }
        }

        Collections.sort(result);

        System.out.println(cnt);
        for (String str : result) {
            System.out.println(str);
        }
    }
}