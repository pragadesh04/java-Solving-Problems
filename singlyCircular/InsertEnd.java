import java.util.Scanner;

class SCLend {
    class node {
        node next;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    node head, last;

    SCLend() {
        head = null;
        last = null;
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

public class InsertEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SCLend action = new SCLend();
        int val = 0;

        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insertEnd(val);
        }

        action.display();
        sc.close();
    }
}
