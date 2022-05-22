import java.util.Scanner;

public class Pairsumsorted {
    static int searchElement(int[] arr,int i,int n,int key){
        int low=i,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key)
                return mid+1;
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
        int sum = sc.nextInt();
        int ans1=0,ans2=0;
        for (int i=0;i<n;i++) {
            int key=sum-arr[i];
            if(key==arr[i]){
                ans1=searchElement(arr,i+1,n,key);
                ans2=i+1;
                System.out.println(ans2+" "+ans1);
                break;
            }else {
                ans1 =searchElement(arr,0,n,key);
                if( ans1!=-1) {
                    ans2 = i + 1;
                    System.out.println(ans2 + " " + ans1);
                    break;
                }
            }
        }
    }
}
