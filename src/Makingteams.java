import java.io.IOException;
import java.util.Scanner;

public class Makingteams {
    public static void main(String[] args) throws IOException {
        int t,n,m,x;
       Scanner sc=new Scanner(System.in);
         t= sc.nextInt();
             n= sc.nextInt();
             m= sc.nextInt();
             x= sc.nextInt();
             int pascal[][]=new int[n+m+1][n+m+1];
             pascal[0][0]=1;
             for(int i=1;i<=n+m;i++){
                 for(int j=0;j<=i;j++){
                     if(j==0 || j==i)
                         pascal[i][j]=1;
                     else
                     pascal[i][j]=pascal[i-1][j]+pascal[i-1][j-1];
                 }
             }
        while(t>0){
             int ans=0;
             ans+=pascal[n+m][x];
            if(x<=m)ans-=pascal[m][x];

            if(x-1<=m)ans-=pascal[m][x-1]*n;

            if(x-2<=m)ans-=pascal[m][x-2]*pascal[n][2];

            if(x-3<=m)ans-=pascal[m][x-3]*pascal[n][3];

            if(n>4 && n>=x)ans-=pascal[m][0]*pascal[n][x];
             System.out.println(ans);
             t--;
         }

    }
}
