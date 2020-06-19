

class Program {
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
