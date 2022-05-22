import java.util.Scanner;

public class Kthsmallestinarray {
    static int cnt(int[] arr,int n,int x){
        int cnt=0;
         for(int i=0;i<n;i++){
             if(arr[i]<=x)
                 cnt++;
         }
         return cnt;
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        int l=0,h=0,mid=0;
        for(int i=0;i<n;i++){
            l=Math.min(l,arr[i]);
            h=Math.max(h,arr[i]);
        }
        while(l<=h){
            mid=(l+h)/2;
            int cnt1=cnt(arr,n,mid);
            if(cnt1<k)
                l=mid+1;
            else {
                int cnt2=cnt(arr,n,mid-1);
                if(cnt2<k){
                    System.out.println(mid);
                    break;}
                else
                    h=mid-1;
            }
        }
    }
}
