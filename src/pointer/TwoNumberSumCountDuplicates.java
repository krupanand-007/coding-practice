package pointer;

import java.util.ArrayList;

public class TwoNumberSumCountDuplicates {

    public int solve(ArrayList<Integer> A, int B) {

        int n=A.size();
        int mod=1000000007;


        int p1=0;
        int p2=n-1;

        long count=0;

        while(p1<p2){
            int a = A.get(p1);
            int b = A.get(p2);
            long sum=(long)a+b;

            if(sum == B){
                int prev1 = p2;
                long count1=0;
                while(prev1>=p1 && A.get(prev1).equals(A.get(p2))){
                    prev1--;
                    count1++;
                    //count=count%mod;
                }
                int prev2 = p1;
                long count2 = 0;
                while(prev2<=p2 && A.get(prev2).equals(A.get(p1))){
                    prev2++;
                    count2++;
                    //count=count%mod;
                }

                if(A.get(p1).equals(A.get(p2))){
                    count=(count + ((count1*(count1-1))/2))%mod;
                }else{
                    count=(count + count1*count2)%mod;
                }
                p1 = prev2;
                p2 = prev1;
            } else if(sum > B){
                p2--;
            }else{
                p1++;
            }
        }
        return (int)count;
    }


}
