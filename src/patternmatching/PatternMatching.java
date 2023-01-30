package patternmatching;

import java.util.ArrayList;
import java.util.List;

public class PatternMatching {

    public static void main(String[] args) {

        String text = "aaabaaab";
        String pat = "baaab";
        List<Integer> ans = matchPattern(text, pat);
        System.out.println(ans);
    }

    static List<Integer> matchPattern(String text, String pat){

        List<Integer> ans = new ArrayList<>();
        int tLen = text.length();
        int pLen = pat.length();
        int j=0;
        for(int i=0 ; i<tLen ; i++){
            if(text.charAt(i)==pat.charAt(j)){
                int i1=i;
                int j1=0;
                while(j1<pLen && text.charAt(i1)==pat.charAt(j1)){
                    i1++;
                    j1++;
                }
                if((j1)==pLen){
                    ans.add(i);
                }
            }
        }
        return ans;
    }
}
