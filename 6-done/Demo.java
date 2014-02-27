import static java.lang.System.out;
class Demo {

    public static void main(String[] args) {
        out.println("Prime nos. 0-200 are:");
        for (int i = 0, j; 200 >= i; i ++) {
            for (j = 2; i > j; j ++) {
                if (0 == i%j) {
                    break;
                }
            }
            if (i == j) {
                out.println(i);
            }
        }
    }
}
