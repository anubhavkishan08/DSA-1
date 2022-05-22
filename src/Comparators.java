import java.util.HashMap;
import java.util.Scanner;

public class Comparators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (freq.containsKey(arr[i]))
                freq.put(arr[i], freq.get(arr[i]) + 1);
            else
                freq.put(arr[i], 1);
        }

        System.out.println(freq);

    }
}
