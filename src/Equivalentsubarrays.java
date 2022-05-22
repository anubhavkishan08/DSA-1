import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Equivalentsubarrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashSet<Integer> s=new HashSet<>();
       for(int i =0;i<n;i++){
           arr[i]=sc.nextInt();
           s.add(arr[i]);
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
       int p1=0,p2=0,ans=0;
       while(p1<n){
           if(p2<n-1) {
               mp.put(arr[p2], mp.getOrDefault(arr[p2], 0) + 1);
               System.out.println(p2 + " " + mp.size());
               if (mp.size() == s.size()) {
                   ans += n - p2;
                   if (mp.get(arr[p1]) == 1) {
                       mp.remove(arr[p1]);
                       p1++;
                   } else {
                       mp.put(arr[p1], mp.get(arr[p1]) - 1);
                       p1++;
                   }
               }
               p2++;
           }
           else {
               if (mp.get(arr[p1]) == 1 || mp.get(arr[p1])==0) {
                   mp.remove(arr[p1]);
                   if (mp.size() == s.size()) {
                       ans += n - p1;
                   p1++;}
               } else {
                   mp.put(arr[p1], mp.get(arr[p1]) - 1);
                   if (mp.size() == s.size()) {
                       ans += n - p1;
                     p1++;}
               }
           }
       }

       System.out.print(ans);
    }
}
