import java.util.Scanner;

public class MrinalQues {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p= sc.nextInt();
        int ans=0,sum=0,cnt=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        for(int i=1;i<=100;i++){
            for(int j=0;j<n;j++){
                ans+=i/arr[j];
            }
            sum=ans;
            ans=0;
            if(sum>=p) {
                System.out.println(i);
                break;
            }
        }
    }
}
