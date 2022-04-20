package exhaustivesearch.no15663.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int N, M;

    static Integer[] intNumbers;
    static String[] result;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());

        Set<Integer> numbers = new HashSet();

        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(stk.nextToken()));
        }

        intNumbers = numbers.toArray(new Integer[0]);
        result = new String[M];
        printNumbers(0,result);
    }

    public void printNumbers(int depth, String[] result){
        if(depth == M){
            System.out.println(String.join(" ", result));
            return;
        }

        for (int i = depth; i < intNumbers.length; i++) {
            result[depth] = String.valueOf(intNumbers[i]);
            printNumbers(depth + 1, result);
        }
    }

    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.solution();
    }
}
