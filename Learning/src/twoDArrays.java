public class twoDArrays {
    public static void main(String[] args) {
//        2D Array(Multi-Dimensional Array) = An array where each element is an array
//                   useful for storing a matrix of data

        String[] fruit = {"apple", "banana", "coconut"};
        String[] veggies = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

//        2D Array

        String[][] groceries = {fruit, veggies, meats};

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}
