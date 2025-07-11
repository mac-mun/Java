public class LinearSearch {
    public static void main(String[] args) {
        /*
         * Linear Search - Iterate through a collection one element at a time
         *                  runtime complexity: O(n)
         *
         *                  Disadvantages
         *                  Slow for large data sets
         *
         *                  Advantages
         *                  Fast for searches of small to medium data sets
         *                  Does not need to be sorted
         *                  Useful for data sets that do not have random access(Linked Lists)
         * */

        int[] array = {9, 1, 8, 2, 7, 3, 4, 5};
        int index = linearSearch(array, 10);
        if (index != -1) {
            System.out.println("Element found at: " + index);
        } else {
            System.out.println("Element Not Found");
        }

    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;

            }
        }
        return -1;
    }
}
