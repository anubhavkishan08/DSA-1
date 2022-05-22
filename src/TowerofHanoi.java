import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TowerofHanoi {
    //static int i=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();  //no of plates
        int n=sc.nextInt();  // step number
         List<Integer> ans=new ArrayList<>();
         List<List<Integer>> res=new ArrayList<>();
        solve(res,ans,N,1,2,n,3);
        System.out.println(res.get(n-1));

      //  System.out.println(ans.get(n)+" "+ ans.get(n+1));
    }
    static void solve(List<List<Integer>> res,List<Integer> ans,int N,int src_tower,int middle_tower,int n,int dest_tower){
          if(N==1){
              ans.add(src_tower);
              ans.add(dest_tower);
             // System.out.println(ans);
              res.add(new ArrayList<>(ans));
              ans.clear();
              return;
          }
          solve(res,ans,N-1,src_tower,dest_tower,n-1,middle_tower); //bottom up
          solve(res,ans,1,src_tower,middle_tower,n-1,dest_tower);
          solve(res,ans,N-1,middle_tower,src_tower,n-1,dest_tower);// top down
    }
}
