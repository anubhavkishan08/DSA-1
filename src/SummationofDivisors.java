import java.util.Scanner;

public class SummationofDivisors {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        long sum=1;
        while(t>0){
            int n= sc.nextInt();
            if(n==1)  {
                System.out.println("0");
                    }
            else {
            for(int i=2;i<=Math.sqrt(n);i++) {
                if (n % i == 0)
                    sum += i + n / i;
            }
            System.out.println(sum);
            sum=1;}
            t--;
        }
    }
}
