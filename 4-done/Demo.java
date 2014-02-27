import static java.lang.System.out;
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(3);
        do {
            out.println("=========================");
            out.println("\tMenu");
            out.println("1) Is empty ?.");
            out.println("2) Add One.");
            out.println("3) Delete One.");
            out.println("4) First One.");
            out.println("5) Count All.");
            out.print("Your choice 1-5: ");
            switch(sc.nextInt()) {
                case 1:
                    if (-1 == q.front && -1 == q.rear) {
                        out.println("Queue is empty");
                    } else {
                        out.println("Queue is not empty");
                    }
                    break;
                case 2:
                    if (q.infos.length - 1 == q.rear) {
                        out.println("Queue is full");
                    } else {
                        out.print("Enter number to add: ");
                        if (-1 == q.front) {
                            q.front = 0;
                        }
                        q.infos[++ q.rear] = sc.nextInt();
                        out.println("Info saved in the queue.");
                    }
                    break;
                case 3:
                    if (-1 == q.front && -1 == q.rear) {
                        out.println("Queue is empty");
                    } else {
                        out.printf("Deleted info: %s\n", q.infos[q.front]);
                        for (int i = q.front; q.rear >= i; i ++) {
                            q.infos[i] = q.infos[i + 1];
                        }
                        q.infos[q.rear --] = 0;
                        q.front = -1 == q.rear ? -1 : q.front;
                    }
                    break;
                case 4:
                    //
                    break;
                case 5:break;
            }
            out.print("Wana quit [y/n] ? ");
        } while (!sc.next().equalsIgnoreCase("y"));
        sc.close();
    }
}
class Queue {
    int front, rear;
    int[] infos;

    Queue(int size) {
        front = rear = -1;
        size = 0 >= size ? 10 : size;
        infos = new int[size];
    }
}
