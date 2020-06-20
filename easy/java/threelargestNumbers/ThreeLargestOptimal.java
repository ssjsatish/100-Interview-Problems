package threelargestNumbers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;


public class ThreeLargestOptimal {
   
    public static void main(String[] args) {
        // Creating empty priority queue
        int[] array = new int[] { -1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7 };
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
        int[] resultArray = new int[3];

        for (Integer integer : array) {
            if(maxHeap.contains(integer*(-1))){
                maxHeap.offer(integer*(-1));
            }
            maxHeap.add(integer * (-1));
           
        }
        int count = 2;
        Iterator<Integer> itr = maxHeap.iterator();

        while (itr.hasNext() && count > -1) {
            resultArray[count--] = (int) itr.next() * (-1);
        }
        Arrays.sort(resultArray);
        System.out.println(resultArray[0] + "," + resultArray[1] + "," + resultArray[2]);
    }
    
}