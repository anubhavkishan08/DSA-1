//given an array cnt the unique subset of the array having the given sum
public class Uniquesubsetsum {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6};
        int n=arr.length;
        int sum=6;
        int i=0,cnt=0;
        int ans=allsubset(arr,n,i,sum);
        System.out.println(ans);
    }
    static int allsubset(int []arr,int n,int i,int remsum){
        int cnt=0;
        if(i==n)
        {
            if(remsum==0) {
                cnt+=1;
                return cnt;
            }
            else
                return 0;
        }
       return allsubset(arr,n,i+1,remsum-arr[i])+allsubset(arr,n,i+1,remsum);
    }
}
