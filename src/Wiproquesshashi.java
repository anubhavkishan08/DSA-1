public class Wiproquesshashi {
    public static void main(String []args){
        String input1="10 10";
        String strarrays[] = input1.split(" ");
        int k=Integer.parseInt(strarrays[1]);
        //  System.out.println(k);

        int cnt=0;
        String input2="3 5 15 12 8 17 2 5 9 7";
        String strarray[] = input2.split(" ");
        int intarray[] = new int[strarray.length];

        for (int count = 0; count < intarray.length ; count++) {
            intarray[count] = Integer.parseInt(strarray[count]);
        }
//System.out.println(intarray[k-1]);

        for (int count = 0; count < intarray.length ; count++) {
            if(intarray[count]>=intarray[k-1])
                cnt++;
        }
        System.out.println(cnt);
    }
}
