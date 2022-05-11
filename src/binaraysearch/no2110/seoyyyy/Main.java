package binaraysearch.no2110.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
5 3
1
2
8
4
9
 */
public class Main {
    public void solution(long[] houses, int C){
        Arrays.sort(houses);

        long min = 1;
        long max = houses[houses.length-1] - houses[0];
        while(min <= max){
            long cnt = 1;
            long start = houses[0];
            long mid = (min + max) / 2;

            for (long housePosition:houses) {
                if(housePosition - start >= mid){
                    start = housePosition;
                    cnt ++;
                }
            }

            if(cnt >= C){
                min = mid + 1;
            }else{
                max = mid -1;
            }
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer stk = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(stk.nextToken());
            int C = Integer.parseInt(stk.nextToken());

            long[] houses = new long[N];
            for (int i = 0; i < houses.length; i++) {
                houses[i] = Long.parseLong(br.readLine());
            }

            Main main = new Main();
            main.solution(houses, C);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
