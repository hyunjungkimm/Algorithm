package exhaustivesearch.no1759.hyunjungkimm;

import java.util.*;

public class Main {
    static int L;
    static int C;
    static String[] alphabet;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        L = scanner.nextInt();
        C = scanner.nextInt();
        alphabet = new String[C];
        visited = new boolean[C];

        for (int i = 0; i < C; i++) {
            alphabet[i] = scanner.next();
        }
        Arrays.sort(alphabet);
        dfs(0, 0);
    }

    public static void dfs(int depth, int start) {
        if (depth == L) {
            if (checked()) {
                for (int i = 0; i < C; i++) {
                    if (visited[i]){
                        System.out.print(alphabet[i]);
                    }
                }
                System.out.println();
            }
            return;
        }


        for (int i = start; i < C; i++) {
            visited[i] = true;
            dfs(depth+1, i+1);
            visited[i] = false;
        }
    }


    public static boolean checked() {
        int vowels = 0;//모음
        int consonants = 0; //자음

        for (int i = 0; i < visited.length; i++) {
            if(visited[i]){
                if (alphabet[i].equals("a") || alphabet[i].equals("i") || alphabet[i].equals("e") || alphabet[i].equals("o") || alphabet[i].equals("u")) {
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        return vowels>=1 && consonants>=2 ? true : false;
     }
}
/*
  1번째 풀이
  public class Main {
    static int L;
    static int C;
    static String[] alphabet;
    static String[] out;
    static boolean[] visited;
    static LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        L = scanner.nextInt();
        C = scanner.nextInt();
        alphabet = new String[C];
        out = new String[L];
        visited = new boolean[C];

        for(int i = 0; i<C; i++){
            alphabet[i] = scanner.next();
        }
        Arrays.sort(alphabet);

        dfs(0);
        linkedHashSet.forEach(System.out::println);
    }

    public static void dfs(int depth){
        if(depth == L){
            StringBuffer sb = new StringBuffer();

            for(String s : out) sb.append(s);

            if(checked(sb)){
                linkedHashSet.add(sb.toString());
            }
            return;
        }

        for(int i = 0; i < C; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = alphabet[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }

    private static boolean checked(StringBuffer sb) {
       char[] stringToChar = sb.toString().toCharArray();
       int vowels = 0;//모음
       int consonants = 0; //자음

       for(int i = 0; i<stringToChar.length; i++){
           if(stringToChar[i] == 'a' || stringToChar[i] =='e'|| stringToChar[i] == 'i' || stringToChar[i] == 'o' || stringToChar[i] == 'u'){
               vowels++;
           }
           consonants++;
       }

       if(vowels < 1 || consonants < 2){
           return false;
       }
       Arrays.sort(stringToChar);
       String sortedString = new String(stringToChar);
       if(!linkedHashSet.contains(sortedString)) {
           return true;
       }
       return false;
    }
}*/

/*
2번쨰 풀이
public class Main {
    static int L;
    static int C;
    static String[] alphabet;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        L = scanner.nextInt();
        C = scanner.nextInt();
        alphabet = new String[C];
        visited = new boolean[C];

        for (int i = 0; i < C; i++) {
            alphabet[i] = scanner.next();
        }
        Arrays.sort(alphabet);
        dfs(0);
    }

    public static void dfs(int depth) {
        if (depth == L) {
            if (checked()) {
                for (int i = 0; i < C; i++) {
                    if (visited[i]){
                        System.out.print(alphabet[i]);
                    }
                }
                System.out.println();
            }
            return;
        }


        for (int i = 0; i < C; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }


    public static boolean checked() {
        int vowels = 0;//모음
        int consonants = 0; //자음

        for (int i = 0; i < visited.length; i++) {
            if(visited[i]){
                if (alphabet[i].equals("a") || alphabet[i].equals("i") || alphabet[i].equals("e") || alphabet[i].equals("o") || alphabet[i].equals("u")) {
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        return vowels>=1 && consonants>=2 ? true : false;
     }
}
* */