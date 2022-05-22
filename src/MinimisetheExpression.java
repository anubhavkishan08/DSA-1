import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinimisetheExpression {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int[] A=new int[n1]; int[] B=new int[n2]; int[] C=new int[n3];
        String[] s1=br.readLine().split(",");
        for(int i=0;i<n1;i++){
            A[i]=Integer.parseInt(s1[i]);
        }
        String[] s2=br.readLine().split(",");
        for(int i=0;i<n2;i++){
            B[i]=Integer.parseInt(s2[i]);
        }
        String[] s3=br.readLine().split(",");
        for(int i=0;i<n3;i++){
            C[i]=Integer.parseInt(s3[i]);
        }
        int p1=0,p2=0,p3=0;
        int ans=Integer.MAX_VALUE;
        while(p1<n1 && p2<n2 && p3<n3){
            int val=Math.max(A[p1],Math.max(B[p2],C[p3]))-Math.min(A[p1],Math.min(B[p2],C[p3]));
            ans=Math.min(ans,val);
            //  System.out.println(val);
            int minm= Math.min(A[p1],Math.min(B[p2],C[p3]));
            if(A[p1]==minm) p1++;
            else if(B[p2]==minm) p2++;
            else p3++;
        }
        System.out.println(ans);
    }
}
