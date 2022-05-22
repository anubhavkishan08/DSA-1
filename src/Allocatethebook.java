import java.util.Scanner;

public class Allocatethebook {
    static boolean isPossible(int[] arr,int mid,int n,int m){
        int cnt=1,sum=0;
        for (int i=0;i<n;i++){
            if(sum+arr[i]>mid){
                cnt++;
                sum=arr[i];}
            else {
                sum+=arr[i];
            }
        }
        return cnt<=m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m= sc.nextInt();
        int l=0,h=0;
        for (int i=0;i<n;i++){
            l=Math.max(l,arr[i]);
            h+=arr[i];
        }

        while (l<=h){
            int mi=l;
            int mid=(l+h)/2;
            boolean r=isPossible(arr,mid,n,m);
            if(!r){
                l=mid+1;
            }
            else {
                boolean r1=isPossible(arr,mid-1,n,m);
                if(!r1 || mid-1<mi){         /*in this for loop we are assuming all arr[i] <= x,
                                            so we would not want to call this function for any value which is
                                           smaller than the max element in the array so before making a call we need to
                                           check if mid - 1 is < max element in array or not so this low is insuring
                                           that although value of low will cange so we can so implement this using a extra varibale*/
                    System.out.println(mid);
                    break;
                }else {
                    h=mid-1;
                }
            }
        }
    }
}
