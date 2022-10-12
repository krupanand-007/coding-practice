package patternmatching;

public class LPSArray {

    public static void main(String[] args) {
        int[] lps = constructLps();

    }
    public static int[] constructLps(){
        String s = "aabbcc$ccbbaa";
        int n = s.length();
        int[] lps = new int[n];

        int j=0;
        int i=1;
        while(i<n){

            if(s.charAt(i)==s.charAt(j)){
                lps[i]=j+1;
                i++;
                j++;
            }else{
                if(j>0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return lps;
    }

}
