package Ex65;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tg ;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    tg = arr[i]; 
                    arr[i] = arr[j];
                    arr[j] = tg;
                } 
            }
        }
        
        for (int i = 0; i <  n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}