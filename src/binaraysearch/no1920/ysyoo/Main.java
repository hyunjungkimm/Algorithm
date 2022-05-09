package binaraysearch.no1920.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1.
        int origin_size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set origin = new HashSet();
        for (int i = 0; i < origin_size; i++) {
            origin.add(st.nextToken());
        }

        // 2.
        int compare_size = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < compare_size; i++) {
            String search = st.nextToken();
            if(origin.contains(search)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
