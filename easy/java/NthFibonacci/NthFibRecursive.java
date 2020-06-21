package NthFibonacci;

public class NthFibRecursive{

    public static void main(String[] args) {
        int n=6;
        System.out.println(getNthFib(n-1));
    }
   

    private static int getNthFib(int n) {
        
        if(n>=2)
        {
            return getNthFib(n-1)+getNthFib(n-2);
        }
       else 
        {
            return n;
        }
        
        }
    
    } 




