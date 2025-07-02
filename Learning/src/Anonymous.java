public class Anonymous {
    public static void main(String[] args) {

        /*
         * Anonymous Class = A class that doesn't have a name. Cannot be reused.
         *                   Add custom behaviour without having to create a new class
         *                   Often used for one time uses(TimerTask, Runnable, Callbacks)
         * */

        Cow cow = new Cow();
        Cow cow2 = new Cow() {

            @Override
            void speak() {
                System.out.println("The Cow speaks Chinese!");
            }

        };

        cow.speak();
        cow2.speak();

    }
}
