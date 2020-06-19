class TwoSumBruteForce {

    public static void main(String[] args) {
        int[] array = {3,-4,5,8,11,-1,1,6};
        int targetSum = 10;
        int[] result = twoNumberSum(array, targetSum)
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
    
}