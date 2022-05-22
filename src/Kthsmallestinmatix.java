import java.util.Scanner;

public class Kthsmallestinmatix {
    static int count(int[]arr,int n,int x){
        int l=0,h=n-1,ans=0;
        while (l<=h){
            int mid=(l+h)/2;
            if(arr[mid]<=x)
                l=mid+1;
            else if(arr[mid]>x){
                if(arr[mid-1]<x){
                    ans=mid;
                    break;
                }else
                    h=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       int key= sc.nextInt();
        int mid=(arr[0][0]+arr[n-1][n-1])/2;
        for(int i=0;i<n;i++){
            int ans=count(arr[i],n,mid);
            System.out.println(ans);
        }
    }
}
