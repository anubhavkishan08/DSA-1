import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset1_findsubset {
    static int cnt=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int targetsum= sc.nextInt();
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        subset(res,ans,arr,0,targetsum);
        System.out.println(res);
        System.out.println(cnt);
    }
    static void subset(List<List<Integer>> res,List<Integer> ans,int[] arr,int i,int sum){
          if(i== arr.length){
              if(sum==0) {
              //    cnt++;
                  if(ans.size()==3)
                  res.add(new ArrayList<>(ans));
              }
                  return;
          }
        ans.add(arr[i]);
          subset(res,ans,arr,i+1,sum-arr[i]);
        ans.remove(ans.size()-1);
          subset(res,ans,arr,i+1,sum);

    }
    static void subset(List<List<Integer>> res,List<Integer> ans,int[] arr,int i,int k,int sz,int n){
        if(i==n) return;
        if(sz==k){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[i]);
        subset(res,ans,arr,i+1,k,sz+1,n);
        ans.remove(ans.size()-1);
        subset(res, ans, arr, i+1, k,sz,n);

    }
}
