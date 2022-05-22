import java.util.Scanner;

public class Smallestgoodbase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            for(int i=63;i>=1;i--){
                int l=2,h=n-1,flag=0;
                while (l<=h){
                    int mid=(l+h)/2;
                     long val=0,x=1;
                    for(int j=0;j<=i;j++) {
                        val += x;
                        if (val >= n)
                            break;
                        else if (j < i && (((n - val) / x) < mid)) {
                            flag = 1;
                            break;
                        }
                        else if (j < i) {
                            x = x * mid;
                        }
                    }
                        if(val>n || flag==1)
                            h=mid-1;
                        else if(val<n)
                            l=mid+1;
                        else {
                            System.out.println(mid);
                          break;}
                    }
                }
            }
        }
    }

