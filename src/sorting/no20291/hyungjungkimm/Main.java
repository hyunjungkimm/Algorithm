package sorting.no20291.hyungjungkimm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>(); //키로 자동 정렬하기 위해 treemap 사용


        for(int i = 0; i<N; i++){
            String s = sc.next();
            String[] arr =  s.split("\\."); // . 그냥 사용하면 안됨 - 정규식 예약어이기 때문이다.
            map.put(arr[1], map.getOrDefault(arr[1], 0)+1);
        }

        List<Map.Entry<String,Integer>> entryList = new LinkedList<>(map.entrySet());

        for(Map.Entry<String, Integer> entry : entryList) {
            System.out.print(entry.getKey()+" ");
            System.out.print(entry.getValue());
            System.out.println();
        }

    }
}
