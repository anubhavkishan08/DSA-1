import java.util.ArrayList;
import java.util.List;

public class Bitmaskingallsubsetofset {
    public static void main (String[] args)
    {
        int[] nums={1,2,3};
        int n= nums.length;
        List<String> arr=new ArrayList<>();
        String s;
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<Math.pow(2,n);i++){
            s=((Integer.toBinaryString(i)));
            System.out.println(s);
        }
    }
}
