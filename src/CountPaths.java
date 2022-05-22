public class CountPaths {
    static int cnt=0;
    public static void main(String[] args){
        int n=3;
        int m=1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        for(int i=1;i<=m;i++){
            int a=2;
            arr[a]=0;
        }
        cnt_paths(arr,n,m);
        System.out.println(cnt);
    }
    static boolean isSafe(int[] arr,int x,int n){
        return (x<n && arr[x]!=0);
    }
    static  void cnt_paths(int[] arr,int x,int n){
        if(x==n-1){
            return ;
        }
        cnt=cnt+1;
      //  System.out.print(x+" ");
        if(isSafe(arr, x+1, n)) {
            cnt_paths(arr, x + 1, n);
            cnt_paths(arr, x + 2, n);
            cnt_paths(arr, x + 3, n);
        }
        if(isSafe(arr, x+2, n)) {
            cnt_paths(arr, x + 1, n);
            cnt_paths(arr, x + 2, n);
            cnt_paths(arr, x + 3, n);
        }
        if(isSafe(arr, x+3, n)) {
            cnt_paths(arr, x + 1, n);
            cnt_paths(arr, x + 2, n);
            cnt_paths(arr, x + 3, n);
        }
    }
}
