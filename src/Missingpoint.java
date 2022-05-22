import java.util.Scanner;

public class Missingpoint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            int len=(4*n)-1;
            int[] arr1=new int[len];
            int[] arr2=new int[len];
            for(int j=0;j<len;j++) {
                arr1[j]=sc.nextInt();
                arr2[j]=sc.nextInt();
            }
            int x=0,y=0;
            for(int j=0;j<len;j++){
                x=x^arr1[j];
                y=y^arr2[j];
            }
            System.out.println(x+" "+y);
        }
    }
}
