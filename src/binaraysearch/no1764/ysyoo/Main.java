package binaraysearch.no1764.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer numNoHear = Integer.parseInt(st.nextToken());
        Integer numNoSee = Integer.parseInt(st.nextToken());

        Set<String> comparelist = new HashSet<String>();
        for (int i = 0; i < numNoHear; i++) {
            comparelist.add(br.readLine());
        }

        // hashset sorting 하려면, List 에 넣어야함 ㅠㅠ 
        List<String> result = new ArrayList<String>();
        for (int j = 0; j < numNoSee; j++) {
            String searching = br.readLine();
            // 중복여부 체크
            if(comparelist.contains(searching)) {
                result.add(searching);
            }
        }

        // sort
        Collections.sort(result);

        // print
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }

    // <!-- 이것도 시간초과 -->
    // public static void main(String[] args) throws IOException {

    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringTokenizer st = new StringTokenizer(br.readLine());

    //     Integer numNoHear = Integer.parseInt(st.nextToken());
    //     Integer numNoSee = Integer.parseInt(st.nextToken());

    //     List<String> arrNoHear = new ArrayList<>();
    //     List<String> arrNoSee = new ArrayList<>();

    //     for (int i = 0; i < numNoHear; i++) {
    //         arrNoHear.add(br.readLine());
    //     }

    //     for (int i = 0; i < numNoSee; i++) {
    //         arrNoSee.add(br.readLine());
    //     }

    //     arrNoHear.retainAll(arrNoSee);

    //     System.out.println(arrNoHear.size());
    //     for (String s : arrNoHear) {
    //         System.out.println(s);
    //     }
    // }
 
    // <!-- 이것도 시간초과 -->
    // public static void main(String[] args) throws IOException {

    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringTokenizer st = new StringTokenizer(br.readLine());

    //     Integer numNoHear = Integer.parseInt(st.nextToken());
    //     Integer numNoSee = Integer.parseInt(st.nextToken());

    //     String[] nohear_array = new String[numNoHear];
    //     for (int i = 0; i < numNoHear; i++) {
    //         nohear_array[i] = br.readLine();
    //     }

    //     ArrayList<String> result = new ArrayList<String>();
    //     for (int j = 0; j < numNoSee; j++) {
    //         String searching = br.readLine();
    //         // 중복여부 체크
    //         for (int i = 0; i < numNoHear; i++) {
    //             if (nohear_array[i].equals(searching)) {
    //                 result.add(nohear_array[i]);
    //             }
    //         }
    //     }

    //     // print
    //     System.out.println(result.size());
    //     result.sort(Comparator.naturalOrder());
    //     for (String s : result) {
    //         System.out.println(s);
    //     }
    // }

}
