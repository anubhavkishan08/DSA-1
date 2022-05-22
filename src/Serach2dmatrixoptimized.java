import java.util.Scanner;

public class Serach2dmatrixoptimized {
    //Time--o(m+n)
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
        int target = sc.nextInt();
        int i=0,j=n-1;//search from a 0,n-1 cordinate.
        while(i<m && j>=0){
            if(arr[i][j]==target){
                System.out.println(i+" "+j);
                return;}
            else if(arr[i][j]>target)//if greater then column shift
                j=j-1;
            else  // if smaller row shift
                i=i+1;
        }
        System.out.println("-1");
    }
}
