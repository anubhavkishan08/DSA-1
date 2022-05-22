import java.util.ArrayList;
import java.util.Scanner;

public class Subset2cnt {
    static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int targetsum= sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        subsetsum(res,ans,arr,0,targetsum);
        System.out.println(cnt);
        System.out.println(res);
    }
    static void subsetsum(ArrayList<ArrayList<Integer>>res,ArrayList<Integer> ans,int[] arr,int i,int sum){
          if(i==arr.length)
                  return;
          if(sum==0) {
              cnt++;
              res.add(new ArrayList<>(ans));
              return;
          }
          if(sum<0) return;
          ans.add(arr[i]);
          subsetsum(res,ans,arr,i,sum-arr[i]);
         ans.remove(ans.size()-1);
          subsetsum(res,ans,arr,i+1,sum);
    }
}
