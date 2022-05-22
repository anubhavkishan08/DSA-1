import java.util.Scanner;

public class Lcmof2nos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b= sc.nextInt();
        long prod=a*b;
        long div=Math.min(a,b);
        long divi=Math.max(a,b);
        while(divi%div!=0){
            long temp=div;
            div=divi%div;
            divi=temp;
        }
        long lcm=prod/div;
        System.out.println(lcm);
    }
}
