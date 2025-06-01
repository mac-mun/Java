import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {

//        SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String Item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        Item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("The total is: " + currency + total);
        scanner.close();


    }
}
