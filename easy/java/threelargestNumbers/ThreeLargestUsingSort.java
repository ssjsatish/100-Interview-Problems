package threelargestNumbers;

import java.util.Arrays;


public class ThreeLargestUsingSort {
    public static void main(String[] args) {
        int[] array = new int[] {141,1,17,-7,-17,-27,18,541,8,7,7};
        int[] result = find3Largest(array);
        System.out.println(result[0]+","+result[1]+","+result[2]);
    }

    private static int[] find3Largest(int[] array) {
        int[] temp = new int[3];
        
Arrays.sort(array);

int i=2;
int k=0;
while(i>-1){
temp[k]=array[array.length-1-i];
i--;
k++;
}
        return temp;
    }
    
    
}