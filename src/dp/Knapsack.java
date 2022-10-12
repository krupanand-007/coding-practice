package dp;

public class Knapsack {

    public static void main(String[] args) {
        int[] A = {60, 100, 120};// {359, 963, 465, 706, 146, 282, 828, 962, 492};
        int[] B = {10, 20, 30};//{96, 43, 28, 37, 92, 5, 3, 54, 93};
        int C = 50;

//        int[] A = {10, 20, 30, 40};
//        int[] B = {12, 13, 15, 19};
        int ans = solve(A, B, C);
        System.out.println(ans);
    }

    public static int solve(int[] A, int[] B, int C) {

        int n=A.length;

        //
        //
        int maxWeight=0;
        int maxVal=0;
        for(int i=0 ; i<n ; i++){ //
            int weight=0;
            int val=0;
            for(int j=i ; j<n ; j++){//10
                weight+=B[j];//
                if(weight>C){
                   // weight-=B[j];
                    break;
                }
                val+=A[j];
            }
           // System.out.print("val "+val+" ");
            maxVal=Math.max(maxVal, val);
           // if()
        }
        return maxVal;
    }
}
