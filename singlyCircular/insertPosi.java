import java.util.Scanner;

class SCLpos {
    class node {
        node next;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    node head, last;

    SCLpos() {
        head = null;
        last = null;
    }

    public void insertPos(int val, int key) {
        node newNode = new node(val);
        if (key == 0)
            insertBeg(val);
        else {
            node temp = head;
            for (int i = 0; i < key - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void insertBeg(int val) {
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

class insertPosi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SCLpos action = new SCLpos();

        System.out.printf("Enter the elements:\n");
        int val = 0;
        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insertBeg(val);
        }

        action.display();

        System.out.printf("\nEnter the position to insert\n");
        int key = sc.nextInt();
        System.out.printf("Enter the value;\n");
        val = sc.nextInt();
        action.insertPos(val, key);
        action.display();
        sc.close();
    }
}