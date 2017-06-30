// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S, int K) 
    {
        String S1 = S.replace("-","");
        S1 = S1.toUpperCase();
        S1 = new StringBuilder(S1).reverse().toString();
        String S2 = "";
        S2 = S2 + S1.charAt(0);
        for(int i=1;i<S1.length();i++)
        {
            if(i%K == 0)
            {
                S2 = S2 + "-";
                S2 = S2 + S1.charAt(i);
            }
            else
            {
                S2 = S2 + S1.charAt(i);
            }
        }
        S2 = new StringBuilder(S2).reverse().toString();
        return S2;
    }
}
