import java.util.*;
public class Square {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        HashMap<Integer,Integer> mp=new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i]))
                mp.put(arr[i], mp.get(arr[i])+1);
            else
                mp.put(arr[i],1);
        }
        System.out.println(mp);
    }
}
