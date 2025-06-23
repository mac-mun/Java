public class OverloadedConstructors {
    public static void main(String[] args) {

//        Overloaded Constructors = Allow a class to have multiple constructors
//                                  with different parameter lists.
//                                   Enable objects to be initialized in various ways.

        Users user1 = new Users("Macharia Munene");
        Users user2 = new Users("Nailah Kagure", "kagure@gmail.com");
        Users user3 = new Users("Zerlina Kabura", "kabura@gmail.com", 6);
        Users user4 = new Users();

        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.userName);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.userName);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.userName);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
