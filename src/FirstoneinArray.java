import java.util.Scanner;

public class FirstoneinArray {
    static int firstoccurence(int[] arr,int n,int key){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<key)
                low=mid+1;
            else if(arr[mid]>key)
                high=mid-1;
            else{
                if(mid==0) return mid+1;
                else if(arr[mid-1]!=key) return mid+1;
                else
                    high=mid-1;
            }
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
            int num = 1;
            int ans1=firstoccurence(arr,n,num);
                System.out.println(ans1);
    }
}
