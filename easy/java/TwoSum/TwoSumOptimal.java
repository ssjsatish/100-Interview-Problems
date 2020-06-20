package TwoSum;

import java.util.HashMap;

class twoSumOptimal {
public static int main(String[] args) {
   int[] result = twoNumberSumOptimal(new int[] {3,5,-4,8,11,-1,1,6}, 10);
   int total = result[0]+result[1];
   return total;
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
