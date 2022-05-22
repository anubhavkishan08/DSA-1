import java.util.Scanner;

public class MaxinArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int i=0;
       int ans= print_max(arr,i,n-1);
       System.out.println(ans);
    }
    static int print_max(int[] arr,int i,int n){
       int ans=0;
        int mid=(i+n)/2;
       if(i==n)
           return (arr[i]);
       else {
          int x=print_max(arr,i,mid);
          int y=print_max(arr,mid+1,n);
            ans= Math.max(x,y);
           return ans;
       }
    }
}
