import java.util.Scanner;

public class Searchakey {
    static int searchElement(int[] arr,int n,int key){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int num = sc.nextInt();
            int ans=searchElement(arr,n,num);
                System.out.println(ans);
        }
    }
}
