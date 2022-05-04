package sorting.no15970.hyungjungkimm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();//정렬
        int sum = 0;

        for(int i = 0; i<N; i++){
            int value = sc.nextInt();
            int key = sc.nextInt();

            if(map.containsKey(key)){
                map.get(key).add(value);
            }else{
                map.put(key, new ArrayList<>());
                map.get(key).add(value);
            }
        }

        Set<Integer> keySet = map.keySet();

        for(int key : keySet){
            ArrayList<Integer> list = map.get(key);
            Collections.sort(list);
            int distance = 0;
            int left = 0;
            int right = 0;

            for(int i = 0; i<list.size(); i++){
                if(i == 0){
                    distance = list.get(i+1) - list.get(i);
                }else if(i == list.size()-1){
                    distance = list.get(i) - list.get(i-1);
                }else{
                    left = list.get(i) - list.get(i-1);
                    right = list.get(i+1) - list.get(i);
                    distance = Math.min(left, right);
                }

                sum += distance;
            }
        };

        System.out.println(sum);


    }
}
