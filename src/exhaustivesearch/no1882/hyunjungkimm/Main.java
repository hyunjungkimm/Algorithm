package exhaustivesearch.no1882.hyunjungkimm;


import java.util.*;

public class Main {
    static int N;
    static int S;
    static int count;
    static int sum;
    static int[] number;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        S = scanner.nextInt();
        number = new int[N];

        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number);// 없어도 됨

        dfs(0, 0);
        System.out.println(count);
    }

    public static void dfs(int depth, int sum) {
        if (depth == N) {
            return;
        }
        if (sum + number[depth] == S) {
            count++;
        }


        dfs(depth + 1, sum);
        dfs(depth+1, sum+number[depth]);

    }
}



/*

public class Main {
    static int N;
    static int S;
    static int count;
    static int[] number;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        S = scanner.nextInt();
        number = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number);

        dfs(1, number[0]);
        System.out.println(count);
    }

    public static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) {
                count++;
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sum += number[depth];
                if (sum == S) {
                    count++;
                    return;
                }
                dfs(depth + 1, sum);
                visited[i] = false;
                sum-=number[i];
            }
        }
    }
}

*/
