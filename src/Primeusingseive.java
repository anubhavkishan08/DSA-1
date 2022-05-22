import java.util.Scanner;

public class Primeusingseive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean[] check= new boolean[n + 1];
        for(int i=1;i<=n;i++)
            check[i]=true;
        check[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(check[i]==true) {
                for (int j = i; j * i <= n; j++) {
                    check[j * i] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(check[i]==true)
                System.out.print(" "+i);
        }
    }
}
//t.c-O(n*log(log n))