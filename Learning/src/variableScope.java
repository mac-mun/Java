public class variableScope {

    static int x = 3; // CLASS VARIABLE

    public static void main(String[] args) {

//        variable scope = where a variable can be accessed

        int x = 1; //LOCAL VARIABLE

        doSomething();

    }

    static void doSomething() {
        int x = 2; // LOCAL

        System.out.println(x);
    }
}
