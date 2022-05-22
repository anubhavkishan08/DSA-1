import java.util.Scanner;

public class Lcmofarrays {
    static int lcm(int a,int b){
        int prod=a*b;
        int div=Math.min(a,b);
        int divi=Math.max(a,b);
        while(divi%div!=0){
            int temp=div;
            div=divi%div;
            divi=temp;
        }
        int lcm=prod/div;
        return lcm;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=lcm(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            ans=lcm(ans,arr[i]);
        }
        System.out.println(ans);
    }
}
//t.c=O(max(log2(arr[i]))