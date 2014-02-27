import static java.lang.System.out;
import java.util.Scanner;
class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(4);
        do {
            out.println("==================");
            out.println("\tMenu");
            out.println("1) Push");
            out.println("2) Pop");
            out.println("3) Display");
            out.println("4) Peek");
            out.print("Enter choice 1-3: ");
            switch (sc.nextInt()) {
                case 1:
                    if (st.top == st.infos.length - 1) {
                        out.println("Stack overflow !");
                    } else {
                        out.print("Enter number to push: ");
                        st.infos[++ st.top] = sc.nextInt();
                        out.println("Info was pushed into stack.");
                    }
                    break;
                case 2:
                    if (-1 == st.top) {
                        out.println("Stack underflow !");
                    } else {
                        out.printf("Poped info: %s\n", st.infos[st.top]);
                        st.infos[st.top --] = 0;
                    }
                    break;
                case 3:
                    if (-1 == st.top) {
                        out.println("Stack is empty !");
                    } else {
                        out.println("Stack elements are:");
                        for (int i = 0; st.top >= i; i ++) {
                            out.println(st.infos[i]);
                        }
                    }
                    break;
                case 4:
                    if (-1 == st.top) {
                        out.println("Stack empty !");
                    } else {
                        out.print("Enter number to peek: ");
                        int i = 0, info = sc.nextInt();
                        while (st.top >= i) {
                            if (info == st.infos[i]) {
                                break;
                            }
                            i ++;
                        }
                        if (st.top < i) {
                            out.println("No match found !");
                        } else {
                            out.printf("Match found: %s at location: %s\n", st.infos[i], (i + 1));
                        }
                    }
                    break;
            }
            out.print("Wana quit [y] ? ");
        } while (!sc.next().equalsIgnoreCase("y"));
        sc.close();
    }
}
class Stack {
    int[] infos;
    int top;

    Stack(int size) {
        size = 0 >= size ? 10 : size;
        infos = new int[size];
        top = -1;
    }
}
