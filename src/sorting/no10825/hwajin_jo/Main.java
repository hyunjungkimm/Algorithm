package sorting.no10825.hwajin_jo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[][] Student = new String[N][4];
        String[] result = new String[N];

        for (int i = 0; i < N; i++) {
            Student[i][0] = sc.next();
            Student[i][1] = sc.next();
            Student[i][2] = sc.next();
            Student[i][3] = sc.next();
        }

        Arrays.sort(Student, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.valueOf(o1[1]) < Integer.valueOf(o2[1])) { // 국어가 감소하는 순으로
                    return 1;
                }
                else if (Integer.valueOf(o1[1]) == Integer.valueOf(o2[1])) { // 국어 점수가 같다면
                    if (Integer.valueOf(o1[2]) == Integer.valueOf(o2[2])) { // 영어 점수가 같다면
                        if (Integer.valueOf(o1[3]) == Integer.valueOf(o2[3])) { // 수학 점수가 같다면
                            return o1[0].compareTo(o2[0]); // 이름순으로 정렬(오름차순)
                        }
                        // 국어랑 영어 점수가 같다면 수학은 내림차순 정렬해야함
                        return Integer.valueOf(o2[3]) - Integer.valueOf(o1[3]);
                    }

                    // 국어 점수가 같다면 영어는 오름차순 정렬해야함
                    return Integer.valueOf(o1[2]) - Integer.valueOf(o2[2]);
                }

                // 국어 점수는 내림차순 정렬
                return Integer.valueOf(o2[1]) - Integer.valueOf(o1[1]);
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(Student[i][0]);
        }
    }
}
