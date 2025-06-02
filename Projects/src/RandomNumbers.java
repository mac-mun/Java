import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {


//        Generating Random Numbers
//        Random random = new Random();
//        int number;
//        int number2;
//        int number3;
//
//        number = random.nextInt(0, 7);
//        number2 = random.nextInt(0, 7);
//        number3 = random.nextInt(0, 7);
//
//
//        System.out.println(number);
//        System.out.println(number2);
//        System.out.println(number3);


//        Generating Random Doubles

//        Random random = new Random();
//        double number;
//
//        number = random.nextDouble();
//
//        System.out.println(number);

//        Generating Booleans --> In the situation where you need to flip a coin

        Random random = new Random();
        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("You Got Heads");
        } else {
            System.out.println("You Got Tails");
        }

//        System.out.println(isHeads);

    }
}
