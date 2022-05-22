import java.util.ArrayList;
import java.util.Arrays;

public class LetterCombinations {
    public static void main(String[] args){
        int i=0;
        String temp = "";
        String digits="23";
        char arr[]=new char[digits.length()];

        ArrayList<ArrayList<Character>> x = new ArrayList<ArrayList<Character> >();
        x.add(new ArrayList<Character>(Arrays.asList('a','b','c')));
        x.add(new ArrayList<Character>(Arrays.asList('d','e','f')));
        x.add(new ArrayList<Character>(Arrays.asList('g','h','i')));
        x.add(new ArrayList<Character>(Arrays.asList('j','k','l')));
        x.add(new ArrayList<Character>(Arrays.asList('m','n','o')));
        x.add(new ArrayList<Character>(Arrays.asList('p','q','r','s')));
        x.add(new ArrayList<Character>(Arrays.asList('t','u','v')));
        x.add(new ArrayList<Character>(Arrays.asList('w','x','y','z')));

       // System.out.println(x);
           ArrayList<String> ans=new ArrayList<>();
        //PrintCombination(temp,digits,i,x,ans);
        PrintCombination(arr,digits,i,x);
       // System.out.println(ans);

    }
    /*static void PrintCombination(String temp,String digits,int i,ArrayList<ArrayList<Character>> x,ArrayList<String> ans){
        if (digits.isEmpty() || i==digits.length()){
           // System.out.println(temp);
            ans.add(temp);
             return;
        }
            for (int j = 0; j < x.get(digits.charAt(i)-'2').size(); j++) {
             //   System.out.println(x.get(i).get(j));
              //  System.out.println(x.get(digits.charAt(i)-'2').get(j));
              PrintCombination(temp + x.get(digits.charAt(i)-'2').get(j), digits,i+1, x,ans);
           }*/
    // Using char array to take less space than string one.
    static void PrintCombination(char arr[],String digits,int i,ArrayList<ArrayList<Character>> x){
        if (digits.isEmpty() || i==digits.length()){
             System.out.println((arr));
            return;
        }
        for (int j = 0; j < x.get(digits.charAt(i)-'2').size(); j++) {
            //   System.out.println(x.get(i).get(j));
            //  System.out.println(x.get(digits.charAt(i)-'2').get(j));
            arr[i]=x.get(digits.charAt(i)-'2').get(j);
            PrintCombination(arr, digits,i+1, x);
        }
    }
}
