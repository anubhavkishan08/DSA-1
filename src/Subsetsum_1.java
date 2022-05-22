import java.util.Scanner;

public class Subsetsum_1 {
   static int cnts=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int targetsum= sc.nextInt();
        int sum=0,i=0;
       subset_count(arr,i,sum,targetsum);
      System.out.println(cnts);
      int ans=subset_counts(arr,i,sum,targetsum);
      System.out.println(ans);
    }
    static void subset_count(int[] arr,int i,int sum,int targetsum){
        if(i== arr.length) {
            if(sum==targetsum) cnts++;
            return;
        }
        subset_count(arr,i+1,sum+arr[i],targetsum);  /// for includin arr[i]
        subset_count(arr,i+1,sum,targetsum);   /// for not including arr[i];
    }
    static int subset_counts(int[] arr,int i,int sum,int targetsum){
        if(i==arr.length){
            if(sum==targetsum) return 1;
            return 0;
        }
        return subset_counts(arr,i+1,sum+arr[i],targetsum)+ subset_counts(arr,i+1,sum,targetsum);
    }
}
