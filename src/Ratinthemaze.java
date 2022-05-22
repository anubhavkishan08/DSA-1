import java.util.ArrayList;
import java.util.Scanner;

public class Ratinthemaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            ArrayList<String> ans = new ArrayList<>();
            String s = " ";
            int[][] vis = new int[n][n];
            pp(arr, 0, 0, n, ans, vis, s);
            for (int k = 0; k < ans.size(); k++){
                System.out.print(ans.get(k) + " ");
            }
            System.out.println();
            t=t-1;
        }
    }
    static void pp(int[] []nums,int i,int j,int n,ArrayList<String> ans,int[][] vis,String s){
        if(nums[i][j]==0) return ;
        if(i==j && j==n-1){
         //  System.out.println(s);
            ans.add(s);
            return ;}
        if(i==n-1){
            pp(nums,i,j+1,n,ans,vis,s+'R');
        }
        else if(j==n-1){
            pp(nums,i+1,j,n,ans,vis,s+'D');
        }
        else {
            pp(nums, i + 1, j, n, ans,vis,s+'D');
            pp(nums, i, j + 1, n, ans,vis,s+'R');
        }
      }
}
