package sorting.no1015.hwajin_jo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt(); // 갯수 입력

        int A[][] = new int[n][2];
        int B[] = new int[n];

        for (int i = 0; i < n; i++) // 배열의 원소값과 인덱스 값 입력
        {
            int k = sc.nextInt();
            A[i][0] = i; // 인덱스 값 입력
            A[i][1] = k; // 배열의 원소 값 입력
        }

        sortArray(A); // 배열을 정럴을 위해 함수 호출

        for (int i = 0; i < n; i++) // A의 인덱스 값을 B배열에 넣어주기
        {
            B[A[i][0]] = i;
        }

        for (int j = 0; j < B.length; j++)
        {
            sb.append(B[j] + " ");
        }
        System.out.println(sb);
    }


    static void sortArray(int[][] arr)
    {
        Arrays.sort(arr, new Comparator<int[]>()
        {
            @Override
            public int compare(int[] arr1, int[] arr2)
            {
                if (arr1[1] < arr2[1])
                    return -1;
                else if (arr1[1] > arr2[1])
                    return 1;
                else
                {
                    if (arr1[0] < arr2[0])
                        return -1;
                    else
                        return 1;
                }
            }
        });
    }


}
