package exhaustivesearch.no15663.hyunjungkimm;

import java.util.*;

public class Main {
    static int N, M;
    static int[] number;
    static int[] out;
    static LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        number = new int[N];
        out = new int[M];
        visited = new boolean[N];

        for(int i = 0; i<N; i++){
            number[i] = sc.nextInt();
        }

        Arrays.sort(number);//정렬 꼭 해줘야 함
        dfs(0);

        Iterator iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
        // forEach 사용 - linkedHashSet.forEach(System.out::println);
    }

    private static void dfs(int depth) {
        if(depth == M){
            StringBuffer sb = new StringBuffer();// static으로 뺴면 그 전 값이 계속 쌓여있어서 새로 생성
            for(int num : out) sb.append(num).append(" ");
            sb.append("\n"); //없어도 됨
            linkedHashSet.add(sb.toString());// HashSet쓴 경우에는 순서 유지가 안됨
            return;
        }

        for(int i = 0; i<N; i++){
            if(!visited[i]) {
                visited[i] = true;
                out[depth] = number[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
