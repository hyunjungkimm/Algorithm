package sorting.no11652.hyungjungkimm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int N = 0;
        long num = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Map<Long, Integer> map = new HashMap<>();

        for(int i = 0; i<N; i++){
            num = sc.nextLong();
            map.put(num, map.getOrDefault(num, 1) +1);
        }
        //값으로 정렬
        List<Long> keySet = new ArrayList<>(map.keySet());

        //카드 개수 내림차순, 카드 넘버 오름차순
        Collections.sort(keySet, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                Integer val1 = map.get(o1);
                Integer val2 = map.get(o2);

                if(val1.equals(val2)){
                    return o1.compareTo(o2);
                }else{
                    return val2.compareTo(val1);
                }
            }
        });

        System.out.println(keySet.get(0));

/*
        keySet.sort(((o1, o2) -> map.get(o2)-map.get(o1)));
        Long min = 0L;

        if(keySet.size() > 1){
            for(int i = 1; i<keySet.size(); i++){
                if(map.get(keySet.get(i-1)).equals(map.get(keySet.get(i)))){
                    min = Math.min(keySet.get(i-1),keySet.get(i));
                }else{
                    min = keySet.get(0);
                    break;
                }
            }
        }else min = keySet.get(0);

        System.out.println(min);*/
    }
}
