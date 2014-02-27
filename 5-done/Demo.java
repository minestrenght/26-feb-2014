import static java.lang.System.out;
class Demo {

    public static void main(String[] args) {
        out.println("Factorial series 0-8 are:");
        for (int i = 0, k, j; 8 >= i; i ++) {
            for (j = k = 1; i >= j; k *= j, j ++);
            out.printf("%s! = %s\n", i, k);
        }
    }
}
