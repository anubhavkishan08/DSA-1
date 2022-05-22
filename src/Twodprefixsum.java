import java.util.Scanner;

public class Twodprefixsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i1,j1,i2,j2;
        i1= sc.nextInt();;
        j1= sc.nextInt();
        i2= sc.nextInt();
        j2= sc.nextInt();
        int arr1[][]=new int[m][n];
        arr1[0][0]=arr[0][0];
        //for 1st column
        for(int i=1;i<m;i++)
            arr1[i][0]=arr1[i-1][0]+arr[i][0];
        //for 1st row
        for(int j=1;j<n;j++)
            arr1[0][j]=arr1[0][j-1]+arr[0][j];

        //for next remaining rows and columns
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                arr1[i][j]=arr1[i-1][j]+arr1[i][j-1]-arr1[i-1][j-1]+arr[i][j];
            }
        }
        System.out.println("prefix sum:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j] +"  " );
            }
            System.out.print("\n");
        }
        if(i1-1>=0) {
            int ans = arr1[i2][j2] - arr1[i1 - 1][j2];
            System.out.println(ans);
        }
        if(j1-1>=0){
            int ans=arr1[i2][j2]-arr1[i2][j1-1];
            System.out.println(ans);
        }
        if(i1-1>=0 && j1-1>=0){
            int ans=arr1[i2][j2]-arr1[i2][j1-1]-arr1[i1-1][j2]+arr1[i1-1][j1-1];
            System.out.println(ans);
        }
    }
}
