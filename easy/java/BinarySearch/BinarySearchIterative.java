package BinarySearch;
public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] array = new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 };
        int target =  33;
        System.out.println(binarySearch(array,target));
    }

   // private static int findIndex(int[] array, int target, int left, int right) {
        public static int binarySearch(int[] array, int target) {
            int left=0;
            int right=array.length-1;
                
                while(left<=right){
                    int mid = (left+right)/2;
                    if(array[mid]== target){
                        return mid;
                    }
                    else
                        if(array[mid]< target){
                            left = mid-1;
                        }
                    else
                    {
                        right= mid+1;
                    }
                    
                }
                return -1;
                
          }
        
    //     while(left<=right) {    
    //         int mid = left+ (right-left)/2;        
    //         if(array[mid]==target) {
    //             return mid;
    //         }
    //         else if(array[mid]>target){
    //             right = mid-1;
    //         }
    //         else {
    //             left = mid+1;
    //         }
    //     }
    //     return -1;
    // }    
}