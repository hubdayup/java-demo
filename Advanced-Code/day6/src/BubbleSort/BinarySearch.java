package BubbleSort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {33, 56, 66, 77, 88};
        int num = 88;
        int ok = binarySearch(num, arr);
        System.out.println(ok);
    }

    private static int binarySearch(int num, int[] arr) {
        int max, min, mid;
        min = 0;
        max = arr.length - 1;

        while (min <= max) {
            mid = (min+max)/2;
            if (num < arr[mid]) {
                max = mid - 1;
            } else if (num > arr[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

