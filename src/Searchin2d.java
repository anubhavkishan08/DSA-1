import java.util.Scanner;

public class Searchin2d {
    static int binarySearch(int[] arr,int i,int n,int key){
        int low=i,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int key= sc.nextInt();
            int flag=0;
            for(int i=0;i<n;i++){
                int ans=binarySearch(arr[i],0,m, key);
                if(ans!=-1){
                    flag=1;
                    break;}
                else
                    flag=0;
            }
            if(flag==1)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
