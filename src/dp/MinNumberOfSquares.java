package dp;

public class MinNumberOfSquares {

    public static void main(String[] args) {
        int ans = countMinSquares(12);
        System.out.println(ans);
        // 2*2 + 2*2 + 2*2
    }

    public static int countMinSquares(int A) {

        int count=0;//2
        while(A!=0){ //1
            count++;//4
            int sq = (int) Math.sqrt(A);//1
            A = A-(sq*sq);//0
        }
        return count;
    }
}
