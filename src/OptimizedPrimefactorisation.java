import java.util.Scanner;

//t.c-O(sqrt(n))
public class OptimizedPrimefactorisation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int num=n;
        for (int i=2;i*i<=num;i++){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n!=1)
        System.out.println(n);

    }
}
