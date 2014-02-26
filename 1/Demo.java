import static java.lang.System.out;
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null;
        do {
            out.println("=========================");
            out.println("\tMenu");
            out.println("1) Add.");
            out.println("2) Display.");
            out.print("Your choice 1-2: ");
            switch(sc.nextInt()) {
                case 1:
                    out.print("Enter number: ");
                    if (null == start) {
                        start = new Node(null, sc.nextInt());
                    } else {
                        Node cur = start;
                        while (null != cur.next) {
                            cur = cur.next;
                        }
                        cur.next = new Node(null, sc.nextInt());
                    }
                    break;
                case 2:
                    if (null == start) {
                        out.println("List is empty !");
                    } else {
                        for (Node cur = start; null != cur; cur = cur.next) {
                            out.printf("info: %s\n", cur.info);
                        }
                    }
                    break;
            }
            out.print("Wana quit [y/n] ? ");
        } while (!sc.next().equalsIgnoreCase("y"));
        sc.close();
    }
}

class Node {
    Node next;
    int info;

    Node(Node next, int info) {
        this.next = next;
        this.info = info;
    }
}
