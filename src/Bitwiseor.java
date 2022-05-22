import java.util.Scanner;

public class Bitwiseor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        long mask=(1L<<31),ans=0;
        for(int i=31;i>=0;i--){
            int next=n;
            for(int j=n-1;j>=0;j--){
                if((arr[j]&mask)!=0){
                    next=j;}
                ans+=((n-next)*mask);}
            mask>>=1;
        }
        System.out.print(ans);
    }
}
