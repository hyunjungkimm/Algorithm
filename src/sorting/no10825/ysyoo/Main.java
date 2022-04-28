package sorting.no10825.ysyoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // throwable
        
        PriorityQueue<Student> q = new PriorityQueue<Student>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()); // throwable

            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int mat = Integer.parseInt(st.nextToken());

            q.add(new Student(kor, eng, mat, name));
        }

        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            Student tmp = q.poll();
            sb.append(tmp.name).append("\n");
        }
        System.out.println(sb);

    }
}

class Student implements Comparable<Student> {
    String name;
    int kor, eng, mat;

    public Student(int kor, int eng, int mat, String name) {
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.kor == o.kor) {
            if (this.eng == o.eng) {
                if (this.mat == o.mat) {
                    return this.name.compareTo(o.name);
                }
                return o.mat - this.mat;
            }
            return this.eng - o.eng;
        }
        return o.kor - this.kor;
    }

}
