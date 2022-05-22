import java.util.Scanner;

 class Squareroot {
    static long squareroot( long n){
        long l=0,h=n,ans=0;
        while (l<=h){
            long mid=(l+h)/2;
            if(mid*mid>n){
                h=mid-1;
            }
            else{
                if((mid+1)*(mid+1)>n){
                    ans=mid;
                    break;}
                else
                    l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long n=sc.nextLong();
            long ans=squareroot(n);
            System.out.println(ans);
        }
    }
}
