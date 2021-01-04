package Palindrome;

public class PalindromeIteration {
    public static void main(String[] args) {
        String str = "abcdcba1";
        int startP = 0;
        int endP=str.length()-1;

        while(startP<endP && endP>=endP/2){
            
            if(str.charAt(startP) != (str.charAt(endP))){
                //return false;
                System.out.println(false);
             
            }
            startP++;
            endP--;
            
        }
        System.out.println(true);
    }
    
}