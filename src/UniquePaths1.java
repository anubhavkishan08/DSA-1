import java.util.ArrayList;
import java.util.Scanner;

 class Pair{
    int x,y;
   public Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class UniquePaths1 {
    public static void main(String[] args){
        int n=4;
        ArrayList<Pair> ans=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        pp(arr,0,0,n,ans);
        for(int k=0;k<ans.size();k++)
        System.out.println(ans.get(k).x + " "+ans.get(k).y);
    }
    static void pp(int[][] nums, int i, int j, int n, ArrayList<Pair> ans){
        if(nums[i][j]==1) return;
            ans.add(new Pair(i,j));
        if(i==j && j==n-1){
          // for(int k=0;i<n;i++)
           // System.out.println(ans.get(k).x + " "+ans.get(k).y);
          return;}
        if(i==n-1){
            pp(nums,i,j+1,n,ans);
        }
        else if(j==n-1){
            pp(nums,i+1,j,n,ans);
        }
        else {
            pp(nums,i+1,j,n,ans);
            pp(nums,i,j+1,n,ans);
        }
       // ans.remove(new Pair(i,j));
    }
}
