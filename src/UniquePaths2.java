import java.util.ArrayList;
import java.util.Scanner;

public class UniquePaths2 {
public  static void main(String[] args){
    int m=3,n=4;
    ArrayList<Pair> ans=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]= sc.nextInt();
        }
      }
    int i,j;
    i=sc.nextInt();
    j=sc.nextInt();
    int[][] vis=new int[m][n];
    int anss=checkPaths(arr,i,j,m,n,vis);
    System.out.println(anss);
    }
    static int checkPaths(int[][] maze,int i, int j,int m,int n,int[][] vis){
     if(maze[i][j]==2) return 1;
     vis[i][j]=1;
     int ans=0;
     if(issafe(maze,i,j+1,m,n) && vis[i][j+1]!=1)
         ans+=checkPaths(maze,i,j+1,m,n,vis);
        if(issafe(maze,i+1,j,m,n) && vis[i+1][j]!=1)
            ans+=checkPaths(maze,i+1,j,m,n,vis);
        if(issafe(maze,i,j-1,m,n) && vis[i][j-1]!=1)
            ans+=checkPaths(maze,i,j-1,m,n,vis);
        if(issafe(maze,i-1,j,m,n) && vis[i-1][j]!=1)
            ans+=checkPaths(maze,i-1,j,m,n,vis);
        vis[i][j]=0;
        return ans;
    }
    static boolean issafe(int[][] maze, int i, int j,int m,int n){
        if (i >= 0 && j >= 0 && i < m && j < n && maze[i][j] != -1) {
                    return true;
            }
        return false;
    }
}
