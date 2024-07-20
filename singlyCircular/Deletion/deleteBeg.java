import java.util.Scanner;

class SCLdelBeg {
    class node {
        node next;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    node head, last;

    SCLdelBeg() {
        head = null;
        last = null;
    }

    public void deleteBeg() {
        if (head == null) {
            System.out.printf("No element to delete");
        } else {
            // node temp = head;
            last.next = head.next;
            head = last.next;
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
    }
}

public class deleteBeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SCLdelBeg action = new SCLdelBeg();
        int val = 0;

        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insertEnd(val);
        }

        action.display();
        System.out.printf("\n\nAfter deletion\t");
        action.deleteBeg();
        action.display();
        sc.close();
    }
}
