package bubbleSort;

public class BubbleSortalgo {
    static int count = 0;
    public static void main(String[] args) {
       
        int[] result = bubbleSort(new int[] { 8, 5, 2, 9, 5, 6, 3 });
        for (int i : result) {
            System.out.print(i + ",");
         
        }
        System.out.println("\nNumber of swaps : "+count);
    }

    public static int[] bubbleSort(int[] array) {
       
        // logic for iterating the array
        for (int k = 0; k < array.length; k++) {
            int i=0;
            for (int j = 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                    count++;
                    i++;
                } else if (array[i] == array[j]) {
                    i++;
                } else if (array[i] < array[j]) {
                    i++;
                }
                
            }
        }
        // logic for swapping

        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int tempVar = array[i];
        array[i] = array[j];
        array[j] = tempVar;
    }
}
