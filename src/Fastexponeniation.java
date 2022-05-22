import java.util.Scanner;

public class Fastexponeniation {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n= sc.nextDouble();
        int k= sc.nextInt();
       double ans= nwpower(n,k);
       if(k<0)
             System.out.println(1/ans);
       else
           System.out.println(ans);
    }
    static double powers(double n,int k){
        double ans=0;
        if(k==0)
            return 1;
       if(k<0) {
            ans= n*powers(n,k+1);
       }
       else{
            ans= n* powers(n,k-1);
       }
        return ans;
    }
    static double nwpower(double n,int k){
        if(k==0) return 1;
        double ans=nwpower(n,k/2);
        if(k%2==0)
        return ans*ans;
        else
            return ans*ans*n;
        
    }
}
