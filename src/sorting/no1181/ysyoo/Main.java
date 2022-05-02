package sorting.no1181.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // throwable

        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                // 길이가 짧은 순 ( 오름차순 )
                return o1.length() - o2.length();
            }

        });

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            if(!q.contains(name))
                q.add(name);
        }

        while (!q.isEmpty()) {
            // 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다. 
            System.out.println(q.poll());
        }
    }

}
