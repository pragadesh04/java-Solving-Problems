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

class DLLins {
    node head;
    node tail;

    DLLins() {
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

    public void insertEnd(int val) {
        // System.out.print("\nInsert end....");
        node newNode = new node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            node temp = tail;
            temp.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
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
        System.out.printf("1 for beg\n2 for end\n3 for pos\n");
        int val = 0, decision = sc.nextInt();
        System.out.printf("Enter numbers stop with -1\n");

        DLLins action = new DLLins();

        if (decision == 1) {
            while (val != -1) {
                val = sc.nextInt();
                if (val == -1)
                    break;
                else {
                    action.insertBeg(val);
                }
            }
        } else if (decision == 2) {
            while (val != -1) {
                val = sc.nextInt();
                if (val == -1)
                    break;
                else {
                    action.insertEnd(val);
                }
            }
        }
        System.out.printf("\nThe node elements are.....\n");
        action.display();
        sc.close();
    }
}
