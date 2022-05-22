import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraysumdividenconquer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

       int i=0,j=n-1;
        int sum=arraysum(arr,i,j);
        int max=arraymax(arr,i,j);
        System.out.println(sum +"  "+max);
    }
    static int arraysum(int[] arr,int i,int j){
        if(i==j) return arr[i];
        int m=(i+j)/2;
        return arraysum(arr,i,m)+arraysum(arr,m+1,j);
    }
    static int arraymax(int[] arr,int i,int j){
        if(i==j) return arr[i];
        int m=(i+j)/2;
        return Math.max(arraymax(arr,i,m) ,arraymax(arr,m+1,j));
    }
}

