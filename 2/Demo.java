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
            out.println("3) Remove.");
            out.print("Your choice 1-3: ");
            switch(sc.nextInt()) {
                case 1:
                    out.print("Enter number to add: ");
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
                case 3:
                    if (null == start) {
                        out.println("List is empty !");
                    } else {
                        out.printf("Enter number to remove: ");
                        int info = sc.nextInt();
                        Node cur = null, prv = null;
                        for (cur = start; null != cur; prv = cur, cur = cur.next) {
                            if (info == cur.info) {
                                break;
                            }
                        }
                        if (null == cur) {
                            out.println("No match found to remove !");
                        } else if (null == prv) {
                            start = cur.next;
                            cur.next = null;
                            out.printf("Info %s was removed.\n", info);
                        } else {
                            prv.next = cur.next;
                            cur.next = null;
                            out.printf("Info %s was removed.\n", info);
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
