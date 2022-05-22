import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Noofstepsto1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        char[] arr=s.toCharArray();
        int len=s.length();
        int cnt=0;
       System.out.print(arr[0]+" "+arr[len-1]);
           for(int i=len-1;i>0;){
               if (arr[i] == '0') {
                   cnt++;
                   i--;
               }
               else {
                   cnt++;
                   while (arr[i] == '1' && i > 0) {
                       cnt++;
                       i--;
                   }
                   if(i==0)
                       cnt++;
                   arr[i]=1;
               }
           }
        System.out.print(cnt);
    }
}
