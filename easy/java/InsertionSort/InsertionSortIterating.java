package InsertionSort;

public class InsertionSortIterating {
    public static void main(String[] args) {
        int[] array = new int[] { 8, 5, 2, 9, 5, 6, 3 };
        //if the array is empty. we need to return a new array.
        if (array.length == 0) {
            System.out.println(new int[] {});
        }
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                // swap
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                // change/update pointer
                j--;
            }

        }
        for (int itr : array) {
            System.out.println(itr);
        }

    }

}