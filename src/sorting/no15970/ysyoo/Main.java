package sorting.no15970.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static int maxofNum = 300;
    public static int minofNum = 2;

    public static void main(String[] args) throws NumberFormatException, IOException {

        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, ArrayList<Integer>> list = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int position = Integer.parseInt(st.nextToken());
            int color = Integer.parseInt(st.nextToken());

            if(list.containsKey(color)){
                list.get(color).add(position);
            }else {
                list.put(color, new ArrayList<Integer>());
                list.get(color).add(position);
            }
            
        }

        int sum = 0;
        for(int color : list.keySet()) {
            ArrayList<Integer> positions = list.get(color);
            Collections.sort(positions);

            int dist = 0;
            int left = 0;
            int right = 0;
            for (int i= 0; i< positions.size(); i++) {
                if( i == 0) {
                    // start
                    dist = positions.get(i+1) - positions.get(i);
                } else if (i == positions.size()-1) {
                    // end
                    dist = positions.get(i) - positions.get(i-1);
                } else {
                    left = positions.get(i) - positions.get(i-1);
                    right = positions.get(i+1) - positions.get(i);
                    dist = Math.min(left,right);
                }
                sum += dist;
            }
        
        } // end-of-for

        System.out.println(sum);
    }

}
