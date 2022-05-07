package sorting.no1181.hyunjungkimm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i<N; i++){
            String s = sc.next();
            map.put(s, s.length());
        }
        //값 정렬
        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer val1 = map.get(o1);
                Integer val2 = map.get(o2);
                if(val1 == val2){
                   return o1.compareTo(o2);
                }else{
                    return val1.compareTo(val2);
                }
            }
        });
        for(int i = 0; i<list.size(); i++){

            System.out.println(list.get(i));
        }
    }
}
