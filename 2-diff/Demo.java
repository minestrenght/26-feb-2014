import static java.lang.System.out;
class Demo {

    public static void main(String[] args) {
        //add
        Node start = new Node(null, 45);
        out.printf("Info is: %s\n", start.info);
        //remove
        if (null == start) {
            out.println("Linked list is empty !");
        } else {
            //deleting from first position
            out.printf("Deleted info: %s\n", start.info);
            start = start.next;
        }
        //remove
        if (null == start) {
            out.println("Linked list is empty !");
        } else {
            //deleting from first position
            out.printf("Deleted info: %s\n", start.info);
            start = start.next;
        }
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
