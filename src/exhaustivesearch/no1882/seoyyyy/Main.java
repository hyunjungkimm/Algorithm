package exhaustivesearch.no1882.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 오답으로 나옴..
public class Main {
    static int N;
    static int S;
    static int cnt;
    static int[] numbers;
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        S = Integer.parseInt(stk.nextToken());

        numbers = new int[N];
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            subSequence(i + 1, numbers[i]);
        }

        System.out.println(cnt);
    }

    public static void subSequence(int depth, int sum){

        if(sum == S) {
            cnt ++;
            return;
        }

        if(depth == numbers.length) return;

        for (int i = depth; i < numbers.length; i++) {
            subSequence(i + 1, sum + numbers[i]);
        }
    }


    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.solution();
    }
}
