public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 4) {
            System.out.println("HI" + i);

            int j = 1;
            while (j <= 3) {
                System.out.println("Don't worry");
                j++;
            }
            i++;
        }
    }
}
