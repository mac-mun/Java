public class Recursion {
    public static void main(String[] args) {
        /*
         * Recursion = When a thing is defined in terms of itself.
         *             Apply the result of a procedure, to a procedure.
         *             A recursive method calls itself. Can be substituted for iteration.
         *             Divide a problem into sub-problems of the same type as the original.
         *             Commonly used with advanced sorting algorithms and navigating trees.
         *
         *             Advantages
         *             -----------
         *             Easier to Read/Write
         *             Easier to Debug
         *
         *             Disadvantages
         *             -------------
         *             Sometimes Slower
         *             Uses more memory
         * */

        System.out.println(factorial(5));
        System.out.println(power(3, 6));
    }

    private static int factorial(int num) {
        if (num < 1) return 1; // base case
        return num * factorial(num - 1);

    }

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1;
        return base * power(base, exponent - 1);
    }

}
