import java.util.Scanner;

public class PROBDIFF {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            int cnt=0;
            int a1,a2,a3,a4;
            a1= sc.nextInt();
            a2= sc.nextInt();
            a3= sc.nextInt();
            a4= sc.nextInt();
            if(a1!=a2 && a3!=a4 || a1!=a3 && a2!=a4 || a1!=a4 && a2!=a3)
                cnt+=2;
            else if(a1!=a2 || a3!=a4 || a1!=a3 || a2!=a4 || a1!=a4 || a2!=a3 || a2!=a4)
                cnt++;
            else
                cnt=0;
            System.out.println(cnt);
            t--;
        }

    }
}
