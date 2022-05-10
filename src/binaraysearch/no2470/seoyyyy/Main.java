package binaraysearch.no2470.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
// 시간초과 에러가 뜸...
//public void solution(Long[] values){
//    Arrays.sort(values);
//    Long n1 = 1000000000L;
//    Long n2 = 1000000000L;
//
//    for (int i = 0; i < values.length - 1; i++) {
//        for (int j = values.length - 1; j > i; j--) {
//            if(Math.abs(values[i] + values[j]) < Math.abs(n1 + n2)){
//                n1 = values[i];
//                n2 = values[j];
//            }
//            if(n1 + n2 == 0){
//                break;
//            }
//        }
//    }
//    System.out.println(n1 +" "+n2);
//}



    public void solution(Long[] values){
        Arrays.sort(values);

        Long[] answer = new Long[2];
        Long min = Long.MAX_VALUE;
        int lp = 0, rp= values.length-1;

        while(lp < rp){
            Long sum = values[lp] + values[rp];
            if(Math.abs(sum) < min){
                answer[0] = values[lp];
                answer[1] = values[rp];
                min = Math.abs(sum);
            }
            if(min == 0) break;

            if(sum < 0) {
                lp ++;
            }else{
                rp --;
            }
        }

        System.out.println(answer[0] +" "+ answer[1]);
    }


    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            Long[] values = new Long[N]; // 용액

            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int i = 0; i < values.length; i++) {
                values[i] = Long.parseLong(stk.nextToken());
            }

            Main main = new Main();
            main.solution(values);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
