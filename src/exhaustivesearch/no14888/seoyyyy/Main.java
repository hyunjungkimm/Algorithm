package exhaustivesearch.no14888.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [] numbers;
    static int[] arith;
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stk.nextToken());
        }

        stk = new StringTokenizer(br.readLine());
        arith = new int[4];

        for (int i = 0; i < arith.length; i++) {
            arith[i] = Integer.parseInt(stk.nextToken());

        }

        calculate(numbers[0], 1);
        System.out.printf("%d\n%d", MAX, MIN);
    }

    public static void calculate(int calNum, int idx){
        if(idx == numbers.length){
            MAX = Math.max(MAX, calNum);
            MIN = Math.min(MIN, calNum);
           return;
        }

        for (int i = 0; i < arith.length; i++) {
            if(arith[i] > 0){
                arith[i] --;

                switch (i){
                    case 0:
                        calculate(calNum + numbers[idx], idx + 1);
                        break;
                    case 1:
                        calculate(calNum - numbers[idx], idx + 1);
                        break;
                    case 2:
                        calculate(calNum * numbers[idx], idx + 1);
                        break;
                    case 3:
                        calculate(calNum / numbers[idx], idx + 1);
                        break;
                }
                arith[i] ++;
            }

        }
    }


    public static void main(String[] args) {
        try {
            Main m = new Main();
            m.solution();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}