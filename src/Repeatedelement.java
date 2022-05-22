import java.util.Scanner;

public class Repeatedelement {
    static int repeated_ele(int[] arr,int n){
        int l=0,h=n-1,ans=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==mid+1){
                if(arr[mid]==arr[mid+1]){
                    ans=mid;
                   break;}
                else
                    l=mid+1;
            }
            else {
                if(arr[mid]==arr[mid-1]){
                    ans=mid;
                    break;
                }
                else
                    h=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=repeated_ele(arr,n);
        System.out.println(arr[ans]);
    }
}
