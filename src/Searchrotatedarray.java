import java.util.Scanner;

public class Searchrotatedarray {
    static int find_pivot(int[] arr,int n){
        int low=0,high=n-1,pivot_idx=0;
        while(low<=high) {
            int mid = (low + high) / 2;

                if (arr[mid] <= arr[n- 1]) {
                    high = mid-1;
                } else {
                    if (arr[mid] > arr[mid+1]){
                        pivot_idx=mid;
                        break;}
                    else
                        low = mid +1;

                }
        }
        return  pivot_idx;
    }
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
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int key = sc.nextInt();
            int ans = -1, pivot_idx = 0;
            pivot_idx=find_pivot(arr,n);
            int ans1=binarySearch(arr,0,pivot_idx+1,key);
            int ans2=binarySearch(arr,pivot_idx+1,n,key);
            ans=Math.max(ans1,ans2);
           System.out.println(ans);
        }
    }
}
