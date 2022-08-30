package pointer;

import java.util.*;

public class ThreeNumberSum {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3);
        ArrayList<ArrayList<Integer>> arrayLists = threeSum(a);
        System.out.println("arrayLists "+arrayLists);
    }

    public static ArrayList<ArrayList<Integer>> threeSum(List<Integer> A) {

        //optimized approach

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(A);
        int n= A.size();

        Set<String> set = new HashSet<>();

        for(int i=0 ; i<n-2 ; i++){
            int a=A.get(i);
            int j=i+1;
            int k=j+1;

            //System.out.print(a+" ");

            while(k<n){
                int b = A.get(j);
                int c = A.get(k);
                int sum=a+b+c;
               // System.out.print(i+" "+j+" "+k+", ");
                if(sum>0){
                    break;
                }
                if(sum==0){
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(a);
                    l.add(A.get(j));
                    l.add(A.get(k));
                    Collections.sort(l);
                    String s = "";
                    for(Integer l1 : l){
                        s+=l1;
                    }
                    if(set.contains(s)){
                        k++;
                        continue;
                    }
                    ans.add(l);
                    set.add(s);
                }
                k++;
            }
        }
        return ans;


        //brute force approach
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // Set<String> set = new HashSet<>();
        // int n=A.size();
        // for(int i=0 ; i<n-2 ; i++){
        //     for(int j=i+1 ; j<n-1 ; j++){
        //         for(int k=j+1 ; k<n ; k++){
        //             int a = A.get(i);
        //             int b = A.get(j);
        //             int c = A.get(k);
        //             if(a+b+c==0){

        //                 if(a>b){  // sorting a, b, c
        //                     int temp=a;
        //                     a=b;
        //                     b=temp;
        //                 }
        //                  if(a>c){
        //                     int temp = a;
        //                     a=c;
        //                     c=temp;
        //                 }
        //                 if(b>c){
        //                     int temp = b;
        //                     b = c;
        //                     c=temp;
        //                 }

        //                  if(set.contains(""+a+b+c+"")){
        //                     continue;
        //                 }
        //                 ArrayList<Integer> ar = new ArrayList<>();
        //                 ar.add(a);
        //                 ar.add(b);
        //                 ar.add(c);
        //                 ans.add(ar);
        //                 set.add(""+a+b+c+"");
        //             }
        //         }
        //     }
        // }

        // return ans;
    }
    public int solve(int[] A, int B) {
        int mod = 1000*1000*1000+7;
        int l=0,r=A.length-1,ans=0;
        while(l < r){
            int sum = A[l]+A[r];
            if(sum == B){
                int count = 0, prev=r;
                while(prev > l && A[r] == A[prev]) {//count duplicate values from right pointer
                    count ++;
                    prev--;
                }
                ans = (ans + count)%mod;
                l++;
            }else if(sum < B){
                l++;
            }else if(sum > B){
                r--;
            }
        }
        return ans;
    }
}
