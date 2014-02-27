import static java.lang.System.out;
class Demo {

    public static void main(String[] args) {
        boolean by5, by2, by3;
        out.println("Numbers divisible by 5 and not by 2 & 3 are:");
        for (int i = 0; 500 >= i; i ++) {
            by5 = 0 == i%5;
            by2 = 0 == i%2;
            by3 = 0 == i%3;
            if (by5 && !(by2 || by3)) {
                out.println(i);
            }
        }
    }
}
