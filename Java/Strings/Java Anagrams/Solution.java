import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int check = 0;
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() == b.length()){
            for(char c = 'a'; c <= 'z';c++){
                for(int i = 0; i< a.length(); i++){
                    if (a.charAt(i) == c){
                        check++;
                    }
                    if (b.charAt(i) == c){
                        check--;
                    }
                        
                }
                if(check != 0) return false;
            }
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}