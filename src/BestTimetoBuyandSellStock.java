import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
      //  int[] smax=new int[n];
        //smax[n-1]=prices[n-1];
        //for(int i=n-2;i>=0;i--){
          //  smax[i]=Math.max(smax[i+1],prices[i]);
        //}
        //int ans=0;
        //for(int i=n-2;i>=0;i--){
          //  int profit=smax[i+1]-prices[i];
            //ans=Math.max(ans,profit); } //can use any of the loops
        //for(int i=0;i<n;i++){
            //int profit=smax[i]-prices[i];
            //ans=Math.max(ans,profit); }
        //now in O(1) space without using smax[] array
        int ans=0,smaxp=prices[n-1];
        for(int i=n-2;i>=0;i--){
            ans=Math.max(ans,smaxp-prices[i]);
            smaxp=Math.max(smaxp,prices[i]);
        }
        System.out.println(ans);
        // can also solve the same using prefix max...
    }
}
