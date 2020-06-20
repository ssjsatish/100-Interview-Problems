package ValidateSubsequence;

import java.util.Arrays;
import java.util.List;

public class validateSubseqOptimal {
    public static void main(String[] args) {
        List<Integer>  array = Arrays.asList (5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer>  sequence = Arrays.asList (1, 6, -1, -1);
        boolean result = isValidSubsequence(array,sequence);
        System.out.println(result);
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        for(int i = 0; i<sequence.size(); i++) {
                if(array.contains(sequence.get(i))) {
                    array = array.subList(array.indexOf(sequence.get(i))+1,array.size());
                }
                else{
                    return false;
                }			
            }
        return true;
      }
}