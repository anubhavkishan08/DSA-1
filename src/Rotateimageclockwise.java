import java.util.Scanner;

public class Rotateimageclockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //doing the transpose of the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse the every row of matrix
       for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=temp;
            }
        }
        //print the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
}
