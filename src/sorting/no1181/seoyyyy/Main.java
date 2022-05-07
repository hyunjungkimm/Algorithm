package sorting.no1181.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution(Set strSet){
        String[] strList = (String[]) strSet.toArray(new String[strSet.size()]);

        Arrays.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){ // 비교대상의 길이가 다를때
                    return o1.length() - o2.length(); //길이로 비교
                }else{
                    return o1.compareTo(o2); // 사전순으로 비교
                }
            }
        });

        for (String str: strList) {
            System.out.println(str);
        }
    }



    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            Set strSet = new HashSet<>();
            for (int i = 0; i < N; i++) {
                strSet.add(br.readLine());
            }

            Main m = new Main();
            m.solution(strSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

