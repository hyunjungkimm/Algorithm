package sorting.no10825.seoyyyy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String[] token;
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            token = br.readLine().split(" ");
            String name = String.valueOf(token[0]);
            int korean = Integer.parseInt(token[1]);
            int english = Integer.parseInt(token[2]);
            int math = Integer.parseInt(token[3]);

            studentList.add(new Student(name, korean, english, math));
        }

        Collections.sort(studentList, new Student());

        for (Student student: studentList ) {
            System.out.println(student.name);
        }
    }



    public static void main(String[] args) {
        Main m = new Main();
        try {
            m.solution();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Student implements Comparator<Student> {
        private String name;
        private int korean;
        private int english;
        private int math;

        public Student(){
        }

        public Student(String name, int korean, int english, int math){
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compare(Student student1, Student student2) {
            if(student1.korean > student2.korean){ // 1. 국어점수가 감소하는 순서
                return -1;
            }else if(student1.korean == student2.korean){ // 2. 국어점수가 같으면
                if(student1.english > student2.english){ // 2. 영어점수가 증가하는 순서
                    return 1;
                }else if(student1.english == student2.english){ // 3. 국어점수와 영어점수가 같으면
                    if(student1.math > student2.math){ // 3. 수학점수가 감소하는 순서
                        return -1;
                    }else if(student1.math == student2.math){ // 4.모든 점수가 같으면 이름이 사전순으로 증가하는 순서
                        return student1.name.compareTo(student2.name);
                    }else{
                        return 1;
                    }
                }else{
                    return -1;
                }
            }else{
                return 1;
            }

        }
    }
}
