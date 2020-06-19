
import java.util.Arrays;
import java.util.HashMap;


class Program {
public static void main(String[] args) {
   int[] result = twoNumberSumOptimal(new int[] {3,5,-4,8,11,-1,1,6}, 10);
}
    
  public static int[] twoNumberSum(int[] array, int targetSum) {
 int len= array.length;
		for(int i=0;i<len-1;i++){
    for(int j=i+1;j<len;j++){
        if(array[i]+array[j]==targetSum){
          return new int[] { array[i],array[j] };
        }
    }
}
		return new int[] {};
  }

  public static int[] twoNumberSumUsingSort(int[] array, int targetSum) {
Arrays.sort(array);
    int leftP =0;
    int rightP = array.length-1;
    while(leftP<rightP){
        if(array[leftP]+array[rightP]==targetSum){
            return new int[] { array[leftP],array[rightP] };
        }
        else if(array[leftP]+array[rightP]<targetSum){
            leftP++;
        }
        else{
            rightP--;
        }
    }
    return new int[] {};
  }

  public static int[] twoNumberSumOptimal(int[] array, int targetSum) {

    HashMap<Integer,Integer> map = new HashMap<>();
    for (int i : array) {
        int potMatch = targetSum-i;
        if(map.containsKey(potMatch)){
            return new int[] {map.get(potMatch),potMatch};
        }
        else
        {
            map.put(i,potMatch);
        }
    }
    return new int[] {};
  }


}
