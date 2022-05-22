import java.util.Scanner;
//time-o(mlogn)...using binary search for every row m;
public class Searchin2dmatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        int i=0;
        while (i<m) {
            int l = 0, h = n - 1;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (arr[i][mid] == target) {
                    System.out.println(i + "," + mid);
                    return;
                } else if (arr[i][mid] < target)
                    l = mid + 1;
                else
                    h = mid - 1;
            }
            i++;
        }
        System.out.println("-1");
    }
}
