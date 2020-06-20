package selectionSort;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] result = selectionSort(new int[] { 8, 5, 2, 9, 5, 6, 3 });
        for (int i : result) {
            System.out.print(i + ",");

        }
        // System.out.println("\nNumber of swaps : "+count);
    }

    public static int[] selectionSort(int[] array) {
      
        for (int i = 0; i < array.length-1; i++) {
            int min = array[i];  
            int k = i;        
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < min){
                    min = array[j];
                    k=j;
            }                
            }
            int temp= array[i];
            array[i]=array[k];
            array[k]=temp;
            System.out.println("after swap "+ array[i]+", "+array[k]);
        }

        return array;
    }

    
}