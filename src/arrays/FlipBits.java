package arrays;

public class FlipBits {

    public static void main(String[] args) {
        String s = "010";
       int [] ans = flip(s);
        System.out.println(ans);

    }
    public static int[] flip(String A) {

        int n = A.length(); //0 1 0
        char[] c = A.toCharArray();
        int max=0; //initial 1's count
        for(int i=0 ; i<n ; i++){
            if(c[i]=='1'){
                max++;
            }
        }
        if(n==max){
            return new int[]{};
        }
        int L=0;
        int R=0;

        for(int i=0 ; i<n ; i++){// max=1
            int count = max; //1
            for(int j=i ; j<n ; j++){ //0 to 2 
                if(c[j]=='0'){//1
                    count++;//1
                }else{
                    count--;
                }
                if(count>max){
                    System.out.print("test "+ max+" "+count+" ");
                    max=count;//2
                    L=i+1;//1
                    R=j+1;//1
                }
            }
        }
        return new int[] {L, R};
    }
}
