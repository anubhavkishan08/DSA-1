import java.util.Scanner;

public class Powerofno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int ans=pow(n,k);
        System.out.println(ans);
    }
    static int pow(int n,int k){
        if(k==0)
            return 1;
        return n*pow(n,k-1);
    }
}
