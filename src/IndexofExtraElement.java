import java.util.Scanner;

public class IndexofExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            arr2[i] = sc.nextInt();
        }

        int l=0,h=n-1,ans=0;
        if(arr1[0]!=arr2[0])
            System.out.println(ans);
        else{
            while (l<=h){
                int mid=(l+h)/2;
                if(arr1[mid]==arr2[mid])
                    l=mid+1;
                else if(arr1[mid]==arr2[mid-1])
                    h=mid-1;
                else
                {
                    ans=mid;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
