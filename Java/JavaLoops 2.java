import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            Double x = Double.valueOf(a);
            for(int j = 0; j< n;j++){
                Double y = x + (Math.pow(2,j)*b);
                x = y;
                System.out.print(y.intValue() + " ");
                
                
            }
            System.out.print("\n");
        }
        in.close();
    }
}
