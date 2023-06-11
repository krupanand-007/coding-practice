package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GenerateSortedSubsets {

    static ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        subsets(list);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

        Collections.sort(A); //sort because we need smaller ele first

        ArrayList<Integer> curr=new ArrayList<>();

        ans.add(curr); //as per the expected o/p case when not selecting any element

        addList(curr,0,A);   //calling our recursive function to do the dirty work
        return ans;
    }
    public static void addList(ArrayList<Integer> curr, int i, ArrayList<Integer> A)
    {
        if(i==A.size()) //this means we have exhausted our options for current arraylist
        {
            return;     // therefore simply return.
        }
        curr.add(A.get(i));  // case when we select our current element

        ans.add(new ArrayList<>(curr));  // adding copy of list in ANSWERlist with curr selected element

        addList(curr,i+1,A);
        curr.remove(curr.size()-1);
        addList(curr,i+1,A);
    }
}
