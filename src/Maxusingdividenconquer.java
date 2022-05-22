public class Maxusingdividenconquer {
    public static void main(String[] args){
        int [] arr={1,20,35,15,24,8,7};
        int n= arr.length;
        int ans=findmax(arr,0,n-1);
        System.out.println(ans);
    }
    static int findmax(int[] arr, int i, int j){
        if(i==j)
            return ( arr[i]);
        int m=(i+j)/2;
        int a=findmax(arr,i,m);
        int b=findmax(arr,m+1,j);
        return Math.max(a,b);
    }
}
