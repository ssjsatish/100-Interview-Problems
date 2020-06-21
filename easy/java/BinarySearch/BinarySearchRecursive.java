package BinarySearch;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 }, 33));
    }

    public static int binarySearch(int[] array, int target) {
        return findTarget(array, 0, array.length-1, target);
    }

    private static int findTarget(int[] array, int left, int right, int target) {
        int mid = (left+right) / 2;
         if (array[mid] > target) {
            return findTarget(array, left, mid, target);
        }
       if (array[mid] < target) {
            return findTarget(array, mid-1, right, target);
        }
        if (array[mid] == target) {
            return mid;
        }
        return mid>-1?mid:-1;
    }
}