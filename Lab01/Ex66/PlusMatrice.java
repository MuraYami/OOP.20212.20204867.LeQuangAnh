package Ex66;
import java.util.Scanner;

public class PlusMatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n= ");
        int n = sc.nextInt();
        System.out.print("m= ");
        int m = sc.nextInt();
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];
        int[][] answer = new int[n][m];

        System.out.println("matrix 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println("]");
        }        

    }

}
    
