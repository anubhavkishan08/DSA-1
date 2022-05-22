import java.util.Arrays;
import java.util.Scanner;

public class BestTimetoBuyandSellStockIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int[] pmin=new int[n];
        int[] pmin_profit=new int[n];
        pmin[0]=prices[0];
        for(int i=1;i<n;i++){
            pmin[i]=Math.min(prices[i],pmin[i-1]);
        }
        pmin_profit[0]=0;
        for(int i=1;i<n;i++){
            int new_profit=prices[i]-pmin[i-1];
            pmin_profit[i]=Math.max(pmin_profit[i-1],new_profit);
        }
        int[] smax=new int[n];
        int[] smax_profit=new int[n];
        smax[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            smax[i]=Math.max(prices[i],smax[i+1]);
        }
        smax_profit[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int new_profit=smax[i+1]-prices[i];
            smax_profit[i]=Math.max(smax_profit[i+1],new_profit);
        }
        int profit=smax_profit[0];
        for(int i=1;i<n;i++){
            int profit_2_transc=pmin_profit[i-1]+smax_profit[i];
            profit=Math.max(profit,profit_2_transc);
        }
        System.out.println(Arrays.toString(pmin));
        System.out.println(Arrays.toString(smax));
        System.out.println(Arrays.toString(pmin_profit));
        System.out.println(Arrays.toString(smax_profit));
        System.out.println(profit);
    }
}
