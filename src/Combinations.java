import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i] = i+1;
        }
        int k=sc.nextInt();
        int sz=0;
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
       // subset(res,ans,arr,0,k,sz,n);
       // subset1(res,ans,arr,0,k,sz,n);
        subset2(res,ans,1,k,sz,n);
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
    }
    /*static void subset(List<List<Integer>> res,List<Integer> ans,int[] arr,int i,int k,int sz,int n){
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
    static void subset(List<List<Integer>> res,List<Integer> ans,int k,int sz,int n){
        if(n<0) return;
        if(sz==k){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(n);
        subset(res,ans,k,sz+1,n-1);
        ans.remove(ans.size()-1);
        subset(res,ans,k,sz,n-1);
    }*/
    static void subset1(List<List<Integer>> res,List<Integer> ans,int[] arr,int i,int k,int sz,int n){
        if(i==n) {
        if(sz==k){
            res.add(new ArrayList<>(ans));
            return;
        }
        return;
    }
        ans.add(arr[i]);
        subset1(res,ans,arr,i+1,k,sz+1,n);
        ans.remove(ans.size()-1);
        subset1(res, ans, arr, i+1, k,sz,n);

    }
    static void subset2(List<List<Integer>> res,List<Integer> ans,int i,int k,int sz,int n){
        if(i>n) {
            if(sz==k){
                res.add(new ArrayList<>(ans));
                return;
            }
            return;
        }
        ans.add(i);
        subset2(res,ans,i+1,k,sz+1,n);
        ans.remove(ans.size()-1);
        subset2(res, ans,i+1, k,sz,n);
    }
}
