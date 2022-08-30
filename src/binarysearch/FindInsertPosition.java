package binarysearch;

public class FindInsertPosition {
    public static void main(String[] args) {
        int[] a = {1,3,6,8,10};
        int ans = searchInsert(a, 5);
        System.out.println("ans "+ans);
    }

    public static int searchInsert(int[] A, int B) {
        //1 3 6 8 10    5
        int s=0, e=A.length-1;
        int m=0;
        while(s<=e){ //0, 4
            m = (s+e)/2;//2
            if(A[m]==B){//
                return m;
            }else if(B<A[m]){
                e=m-1;//1
            }else{
                s=m+1;
            }
        }
        return s;
    }

}
