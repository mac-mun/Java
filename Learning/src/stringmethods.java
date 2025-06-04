public class stringmethods {

    public static void main(String[] args) {

        String name = "Password";
        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(2);
        System.out.println(letter);

        int index = name.indexOf('h');
        System.out.println(index);

        int lastIndex = name.lastIndexOf('a');
        System.out.println(lastIndex);

//        name = name.toUpperCase();
//        System.out.println(name);
//
//
//        name = name.toLowerCase();
//        System.out.println(name);
////        trimming white space
//
//        name = name.trim();
//        System.out.println(name);


//        replacing character with another
        name = name.replace("c", "s");
        System.out.println(name);

//    Checking if a string is Empty;
        System.out.println(name.isEmpty());


//    Checking if the name contaains any characters

//        if (name.contains("a")) {
//            System.out.println("Your name contains the character a");
//        } else {
//            System.out.println("Your name DOESN'T contain the character a");
//        }

//        Checking if 2 strings are equal

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello" + name);
        }
    }

}
