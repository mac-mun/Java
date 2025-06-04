public class nested {

    public static void main(String[] args) {


        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;


        if (isStudent) {

            if (isSenior) {
                System.out.println("You get a Senior Discount of 20%");
                System.out.println("You get a 10% Student Discount");
                price *= 0.7;
            } else {
                price *= 0.9;
                System.out.println("You get a 10% Student Discount");
            }

        } else {
            if (isSenior) {
                System.out.println("You get a Senior Discount of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }

        System.out.printf("The Price of a ticket is: $ %.2f", price);
    }
}
