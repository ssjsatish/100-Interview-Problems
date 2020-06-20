package ValidateSubsequence;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequenceBruteForce {
    public static void main(String[] args) {
        List<Integer>  array = Arrays.asList (5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer>  sequence = Arrays.asList (1, 6, -1, -1);
        boolean result = isValidSubsequence(array,sequence);
        System.out.println(result);
    }

    
 public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int k=0;
		for(int i=0;i<array.size();i++){
          
			if(array.get(i)==sequence.get(k)&& i<array.size() && k<sequence.size()){
				k++;
            }	
            if(k == sequence.size())
			{
				return true;
			}
			
		}
    return false;
  }
    
}