package binaraysearch.no2110.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        // house list and sort
        int[] house = new int[size];
        for (int i = 0; i < size; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(house);

        // calc interval
        int dist = house[size - 1] - house[0];
        int interval = dist / (count - 2 + 1);

        // hub list
        int[] hub = new int[count];
        hub[0] = house[0];

        // searching hub
        int start = hub[0];
        int index = 1;
        while (index < count) {
            start += interval;

            // search nearest key
            int min = dist;
            int pos = 0;
            for (int i = 0; i < size; i++) {
                int calc = Math.abs(house[i] - start);
                if (min > calc) {
                    min = calc;
                    pos = house[i];
                }
            }

            // put hub
            hub[index++] = pos;
        }

        // 가장 인접한 두 공유기 사이의 거리
        int max_result = dist;
        for (int i = 0; i < count; i++) {
            int cal = 0;
            if (i == 0) {
                cal = Math.abs(hub[i] - hub[i + 1]);
            } else if (i == count - 1) {
                cal = Math.abs(hub[i] - hub[i - 1]);
            } else {
                cal = Math.abs(hub[i - 1] - hub[i]);
            }
            if (max_result > cal) {
                max_result = cal;
            }
        }

        System.out.println(max_result);
        // 이해가 안감.. 왜 틀린지 모르겠음돵...
    }

}
