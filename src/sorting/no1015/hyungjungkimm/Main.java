package sorting.no1015.hyungjungkimm;


import java.util.*;
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][2];//0번째는 인덱스값, 1번째는 a배열 값
        int[] B = new int[N];

        for(int i = 0; i<N; i++){
            A[i][0] = i;
            A[i][1] = sc.nextInt();
        }
        //주어진 객체보다 작으면 음수, 같으면 0, 크면 양수를 리턴
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] < o2[1]) return o1[1] - o2[1];
                else if(o1[1] > o2[1]) return o1[1] - o2[1];
                else{
                    if(o1[0] < o2[0]) return o1[0] - o2[0];
                    else return o1[0] - o2[0];
                }
            }
        });

        for(int i = 0; i<N; i++){
            B[A[i][0]] = i;
        }

        for(int i = 0; i<B.length; i++){
            System.out.print(B[i]);
            System.out.print(" ");
        }
    }
}*/



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        Queue<Integer> queue= new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            queue.offer(arr[i]);
        }
        Arrays.sort(arr);

        int count = 1;
        while(queue.size() != 0){
            for(int i = 0; i<arr.length; i++){
                if(queue.peek() == arr[i]){
                    if(answer.contains(i)){
                        answer.add(i+count);
                        count++;
                        queue.poll();
                    }else{
                        answer.add(i);
                        queue.poll();
                    }
                    break;
                }

            }
            count = 1;
        }

        for(int i = 0; i<answer.size();i++){
            System.out.print(answer.get(i));
            System.out.print(" ");
        }
    }
}


