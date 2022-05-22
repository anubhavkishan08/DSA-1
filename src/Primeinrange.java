import java.util.Scanner;

public class Primeinrange {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int cnt=0;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0)
                    cnt++;
            }
            if(cnt==0)
                System.out.println(i + " Prime");
            else
                System.out.println(i + " Not Prime");
        }
    }
}
