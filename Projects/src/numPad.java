public class numPad {
    public static void main(String[] args) {
        char[][] telephone =
                {{'1', '2', '3'},
                        {'4', '5', '6'},
                        {'7', '8', '9'},
                        {'*', '0', '#'}};

        for (char[] rows : telephone) {
            for (char num : rows) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
