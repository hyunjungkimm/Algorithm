package exhaustivesearch.no14888.hyunjungkimm;


import java.util.Scanner;

public class Main {
    static int N;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] number;
    static int[] operator = new int[4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        number = new int[N];

        for(int i = 0; i<N; i++){
            number[i] = scanner.nextInt();
        }

        for(int i = 0; i<4; i++){
            operator[i] = scanner.nextInt();
        }

        dfs(1, number[0]);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int depth, int num) {
        if(depth == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for(int i = 0; i<4; i++){
            if(operator[i] > 0){
                operator[i]--;

                switch (i){
                    case 0 : dfs(depth+1, num+number[depth]); break;
                    case 1 : dfs(depth+1, num-number[depth]); break;
                    case 2 : dfs(depth+1, num*number[depth]); break;
                    case 3 : dfs(depth+1, num/number[depth]); break;
                }

                operator[i] ++;
            }
        }
    }
}
