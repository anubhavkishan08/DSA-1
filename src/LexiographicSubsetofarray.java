import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LexiographicSubsetofarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        printSubset(res,ans,arr,i,n);
        System.out.println(res);
    }
    static void printSubset(List<List<Integer>> res,List<Integer> ans,int[] arr,int i,int n){
          if(i==n){
              res.add(new ArrayList<>(ans));
              return;
          }
          ans.add(arr[i]);
       printSubset(res,ans,arr,i+1,n);
       ans.remove(ans.size()-1);
       printSubset(res,ans,arr,i+1,n);
    }
}
