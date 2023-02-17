import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        String B = "";
        for(int i=0;i<A.length();i++){
            B = A.charAt(i) + B;
        }
        if(A.compareTo(B) == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}



