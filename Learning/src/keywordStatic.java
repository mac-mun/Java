public class keywordStatic {
    public static void main(String[] args) {
//          Static = makes a variable or method belong to the class
//                   rather than to any specific object
//                   Commonly used for utility methods or shared resources
        friend friend1 = new friend("Spongebob");
        friend friend2 = new friend("Patrick");
        friend friend3 = new friend("Sandy Cheeks");
        friend friend4 = new friend("Squidward");
        friend friend5 = new friend("Larry");

        System.out.println(friend.numOfFriends);
        friend.showFriends();


    }
}
