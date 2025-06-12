public class variableArguments {

    public static void main(String[] args) {
//        varargs = allow a method to accept a varying # of arguments
//                  makes methods more flexible, no need for overloaded methods
//                  java will pack the arguments into an array
//                  ...(ellipsis)

        System.out.println(add(1, 2, 3));
        System.out.println(average(65, 87, 8));
    }

    static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers1) {
        double sum = 0;
        if (numbers1.length == 0) {
            return 0;
        }
        for (double number1 : numbers1) {
            sum += number1;
        }

        return sum / numbers1.length;

    }
}
