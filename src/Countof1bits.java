import java.util.Scanner;

public class Countof1bits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long num=n;
        int cnt=0;
        while(num!=0){
            num=(num & (num-1));
            cnt++;
            num=(num<<1);
        }
        System.out.print(cnt);
    }
}
