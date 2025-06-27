public class Interface {
    public static void main(String[] args) {
//        Interface = A blueprint for a class that specifies as et if abstract methods
//                    that implementing classes MUST define.
//                    Support multiple inheritance-like behaviour.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish2 fish2 = new Fish2();

        rabbit.flee();
        hawk.hunt();
        fish2.flee();
        fish2.hunt();
    }
}
