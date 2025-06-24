public class friend {

    static int numOfFriends;
    String name;

    friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numOfFriends + " total friends!");
    }
}
