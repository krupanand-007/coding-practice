package sorting;

public class QuickSort {


    public static void main(String[] args) {
        int[] a = {1, 4, 10, 2, 1, 5 };

        solve(a);

        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }

    }
    public static int[] solve(int[] A) {

        quickSort(A, 0, A.length-1);

        return A;
    }

    static void quickSort(int[] A, int s, int e){
        if(s>=e){
            return;
        }
        int rnd = (int)(Math.random()*(e-s+1))+s;
        swap(A, s, rnd);
        int p = position(A, s, e);
        quickSort(A, s, p-1);
        quickSort(A, p, e);

    }
    static  int position(int[] A, int s, int e){
        int p=s;
        int l=s+1;
        int r=e;

        while(l<=r){
            if(A[l]<=A[p]){
                l++;
            }else if(A[r]>A[p]){
                r--;
            }else{
                swap(A, l, r);
                l++;
                r--;
            }
        }
        swap(A,s,r);
        return r;
    }

    static void swap(int[] A, int p1, int p2){
        if(p1==p2){
            return;
        }
        int temp = A[p1];
        A[p1] = A[p2];
        A[p2] = temp;
    }
}
