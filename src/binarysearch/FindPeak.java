package binarysearch;

public class FindPeak {
    public static void main(String[] args) {
        int[] a = {5, 17, 100, 11};
        int ans = findPeak(a);
        System.out.println("ans " + ans);
    }

    public static int findPeak(int[] a) {

        int l = 0;
        int r = a.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] < a[m + 1]) {
                l = m + 1;
            } else {
                r = m;
            }

        }
        return a[l];
    }
}
