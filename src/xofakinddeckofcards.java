import java.io.IOException;
import java.util.*;

public class xofakinddeckofcards {
    static long gcd(long a,long b){
        long div=Math.min(a,b);
        long divi=Math.max(a, b);
        while(divi%div!=0){
            long temp=div;
            div=divi%div;
            divi=temp;
        }
        return div;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        if (arr.length == 1) {
            System.out.println("false");
            return;
        }
        if(arr.length==2){
            if(arr[0]==arr[1])
                System.out.println("true");
            else
                System.out.println("false");
            return;
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        Collection<Integer> values = mp.values();

        // Creating an ArrayList of values
        ArrayList<Integer> listOfValues = new ArrayList<>(values);
            long ans = gcd(listOfValues.get(0), listOfValues.get(1));


            for(int i = 2; i < listOfValues.size(); i++) {
                ans = gcd(ans, listOfValues.get(i));
            }
             //System.out.println(ans);
        if(ans>=2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
