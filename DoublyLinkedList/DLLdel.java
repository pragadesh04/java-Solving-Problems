import java.util.Scanner;

class node {
    node next;
    node prev;
    int data;

    public node(int val) {
        this.data = val;
        this.next = null;
        this.prev = null;
    }
}

class DLLdel {
    node head;
    node tail;

    public DLLdel() {
        head = null;
        tail = null;
    }

    public void insertBeg(int val) {
        node newNode = new node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            node temp = head;
            newNode.next = temp;
            temp.prev = newNode;
            head = newNode;
        }
    }

    public void delAtBegin() {
        head = head.next;
        head.prev = null;
    }

    public void delAtEnd() {
        tail = tail.prev;
        tail.next = null;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = 0;
        System.out.printf("Enter numbers stop with -1\n");

        DLLdel action = new DLLdel();
        while (val != -1) {
            val = sc.nextInt();
            if (val == -1)
                break;
            else {
                action.insertBeg(val);
            }
        }
        System.out.printf("\nThe node elements before delete.....\n");
        action.display();

        System.out.printf("\nAfter deleting at begin");
        action.delAtBegin();
        action.display();

        System.out.printf("\nAfter deleting at end");
        action.display();
        action.delAtEnd();
        sc.close();
    }
}