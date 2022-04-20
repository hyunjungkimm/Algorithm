package exhaustivesearch.no1759.hwajin_jo;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int L, C;
    static char[] code, list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        L = sc.nextInt(); // 암호의 길이
        C = sc.nextInt(); // 문자의 갯수

        list = new char[C];
        code = new char[L];

        for (int i = 0; i < C; i++) {
            list[i] = sc.next().charAt(0);
        }

        Arrays.sort(list);

        solution(0, 0);
    }

    public static void solution(int depth, int start) {

        if (depth == L) {
            if (isChecked()) {
                System.out.println(code);
            }
            return;
        }

        for (int i = start; i < C; i++) {
            code[depth] = list[i];
            solution(depth + 1, i + 1);
        }
    }

    // 모음 1개 이상 자음 2개 이상 확인
    public static boolean isChecked() {
        int mc = 0;
        int jc = 0;

        for (char x : code) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mc++;
            } else {
                jc++;
            }
        }

        if (mc >= 1 && jc >= 2) {
            return true;
        }

        return false;
    }
}
