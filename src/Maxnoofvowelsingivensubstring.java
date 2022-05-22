import java.util.Scanner;

public class Maxnoofvowelsingivensubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int n=s.length();
        int cnt=0,ans=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                cnt++;
                ans=Math.max(ans,cnt);
            }
        }
        for(int i=k;i<n;i++){
            if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u'){
                cnt--;
                ans=Math.max(ans,cnt);}
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                cnt++;
                ans=Math.max(ans,cnt);}
        }
        System.out.println(ans);
    }
}
