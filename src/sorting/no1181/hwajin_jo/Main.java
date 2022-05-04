package sorting.no1181.hwajin_jo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        List sortedList = new ArrayList(set);

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) { // 만약 길이가 같은 경우에는
                    return o1.compareTo(o2); // 사전 순으로 오름차순
                } else { // 길이가 다른 경우에는
                    return Integer.compare(o1.length(), o2.length()); // 길이 순서대로 오름차순
                }
            }
        };

        Collections.sort(sortedList, c);

        for (Object str : sortedList) {
            System.out.println(str);
        }

    }
}
