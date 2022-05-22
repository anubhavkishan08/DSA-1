import java.util.Scanner;

public class CHFINVNT {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            int n, k, p, cnt = 1;
            n = sc.nextInt();
            k = sc.nextInt();
            p = sc.nextInt();
            int i=0,j=0;
            while (i<n){
                if(i!=k){
                    cnt++;
                    i+=p;
                }
                else if(i==p){
                    i=i%p;
                    i++;
                }
                 if(i==k)
                    break;
            }
            System.out.println(cnt);
            t--;
        }
    }
}
