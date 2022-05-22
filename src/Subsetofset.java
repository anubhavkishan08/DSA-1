import java.util.ArrayList;
import java.util.Scanner;

public class Subsetofset {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] temp=new int[n];
        int i=0,j=0;
        print_subset(arr,n,i,temp,j);
    }
    static void print_subset(int []arr,int n,int i,int[] temp,int j){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer> > arrLL = new ArrayList<ArrayList<Integer> >();
        if(i==n) {
            for (int k = 0; k < j; k++) {
                //System.out.println(temp[k]);
                list.add(temp[k]);
            }
            System.out.println(list);
        }
        else{
          temp[j]=arr[i];
          print_subset(arr,n,i+1,temp,j+1);
          print_subset(arr,n,i+1,temp,j);
        }
    }
}
