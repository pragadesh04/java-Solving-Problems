import java.util.Scanner;

class SCLdelEnd {
    class node {
        node next;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    node head, last;

    SCLdelEnd() {
        head = null;
        last = null;
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.printf("No element to delete");
        } else {
            node temp = head;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }

    public void insertEnd(int val) {
        node newNode = new node(val);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.next = head;
            last = newNode;
        }
    }

    public void display() {
        node temp = head;
        do {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        } while (temp != head);
        System.out.printf("\n");
    }
}

public class deleteEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SCLdelEnd action = new SCLdelEnd();
        int val = 0;

        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insertEnd(val);
        }

        action.display();
        System.out.printf("\n\nAfter deletion\n");
        action.deleteEnd();
        action.display();
        sc.close();
    }
}