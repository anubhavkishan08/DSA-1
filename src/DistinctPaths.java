import java.util.Scanner;

public class DistinctPaths {
    private static int cnt=0;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        int n=sc.nextInt();
        int m=sc.nextInt();
        //System.out.println(CountPaths(i,j,n,m));
        countPaths(i,j,m,n);
    }
    /*static int CountPaths(int i,int j,int n,int m){
        if(i==n-1 || j==m-1 )
            return 1;
        return CountPaths(i+1,j,n,m)+CountPaths(i,j+1,n,m);
    }*/
    static void countPaths(int i,int j,int n,int m){
        if(i==n-1 || j==m-1){
            cnt++;
            return;
        }
        countPaths(i+1,j,n,m);
        countPaths(i,j+1,n,m);

        System.out.println(cnt);
    }
}
