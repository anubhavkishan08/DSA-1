import java.util.Scanner;

public class Peakelement {
  static   int peak_element(int[] arr,int n) {
      int low = 0, high = n - 1, ans = 0;
      while (low<=high){
          int mid=(low+high)/2;
         //System.out.println(mid);
          if(mid==0){
              if(arr[mid]>=arr[mid+1]){
                  ans=mid;
                  break;}
              else
                  low=mid+1;
          }
           else if(mid==n-1){
              if(arr[mid]>=arr[mid-1]){
                  ans=mid;
                  break;
              }
              else
                  high=mid-1;
          }
         else if(arr[mid]>=arr[mid+1] && arr[mid]>=arr[mid-1]) {
             ans = mid;
             break;
         }
          else {
              if(arr[mid+1]>=arr[mid])
                  low=mid+1;
              else if(arr[mid-1]>=arr[mid])
                  high=mid-1;
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
        int ans=peak_element(arr,n);
        System.out.println(arr[ans]);
    }
}
