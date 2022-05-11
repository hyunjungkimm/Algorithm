package binaraysearch.no2805.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
4 7
20 15 10 17
 */

public class Main {
// 실패 (시간초과)
//    public void solution(Long[] trees, Long M){
//        Long sum = 0L;
//        for (Long height:trees) {
//            sum += height;
//        }
//
//        Long cutHeight = sum / trees.length; // 처음엔 나무의 평균 값으로 세팅
//
//        while(true){
//            int calVal = 0;
//            for (int i = 0; i < trees.length; i++) {
//                if(cutHeight < trees[i]){
//                    calVal += trees[i] - cutHeight;
//                }
//            }
//
//            if(calVal == M) break;
//
//            if(calVal < M){
//                cutHeight --;
//            }else{
//                cutHeight ++;
//            }
//        }
//
//        System.out.println(cutHeight);
//    }


    public void solution(long[] trees, Long M){
        Arrays.sort(trees);
        /**
         *  실패한 이유
         *  1. Long 클래스로 사용 시 primitive type인 long보다 메모리 공간을 더 사용하여 시간초과
         *  2. start와 end를 trees 배열의 가장 작은 값과 가장 큰 값으로 초기화하게되면 아래와 같은 반례는 통과될 수 없음
         1 10000000000
         10000000000
         *      --> 따라서 start는 0, end는 문제의 주어진 나무의 길이 최대값으로 초기화한다.
         */
//        Long start = trees[0];
//        Long end = trees[trees.length-1];

        long start = 0;
        long end = 2000000000;

        while(start <= end){
            long mid = (start + end) / 2;

            long sum = 0L;
            for (long treeHeight: trees) {
                if(mid < treeHeight){
                    sum += treeHeight - mid;
                }
            }

            if(sum >= M){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(end);

    }


    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer stk = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(stk.nextToken());
            long M = Long.parseLong(stk.nextToken());

            stk = new StringTokenizer(br.readLine());

            long[] trees = new long[N];
            for (int i = 0; i < trees.length; i++) {
                trees[i] = Long.parseLong(stk.nextToken());
            }

            Main main = new Main();
            main.solution(trees, M);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
