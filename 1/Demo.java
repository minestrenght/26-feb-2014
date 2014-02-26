import static java.lang.System.out;
class Demo {

    public static void main(String[] args) {
        Node start = new Node(null, 45);
        Node cur = null;
        cur = start;
        while (null != cur) {
            out.printf("info: %s\n", cur.info);
            cur = cur.next;
        }
        out.println("=================");
        start.next = new Node(null, 56);
        cur = start;
        while (null != cur) {
            out.printf("info: %s\n", cur.info);
            cur = cur.next;
        }
        out.println("=================");
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
