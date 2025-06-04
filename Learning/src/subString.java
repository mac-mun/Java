import java.util.Scanner;

public class subString {

    public static void main(String[] args) {
//        .substring() = A method used to extract a portion of a string
//                       string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        
        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Invalid Email");
        }

        scanner.close();
    }


}
