import java.util.Arrays;

public class TwoSumUsingSortTwoPointer {

    public static int main(String[] args) {
        int[] array = {3,-4,5,8,11,-1,1,6};
        int targetSum = 10;
        int[] result = twoNumberSumUsingSort(array, targetSum);
        int total = result[0]+result[1];
        return total;
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
}

