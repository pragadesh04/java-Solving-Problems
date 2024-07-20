import java.util.Scanner;

class SCL {
    class node {
        node next;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    node head, last;

    SCL() {
        head = null;
        last = null;
    }

    public void deletePos(int key) {
        if (head == null)
            System.out.printf("No element to delete");
        else {
            node temp = head;
            int i = 0;
            while (i != key - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
    }

    public void deletePosElem(int val) {
        if (head == null)
            System.out.printf("\nNo element to delete\n");
        else {
            node temp = head;
            while (temp.next.data != val) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void insertBeg(int val) {
        node newNode = new node(val);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            last = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            last.next = newNode;
        }
    }

    public void display() {
        node temp = head;
        do {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        } while (temp != head);
        System.out.printf("\n\n");
    }
}

class deletePosi {
    public static void main(String[] args) {
        SCL action = new SCL();
        Scanner sc = new Scanner(System.in);
        // Getting input

        int val = 0;
        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insertBeg(val);
        }
        action.display();

        System.out.printf("delete using?\n1 to position\n2 element\n\n==========================\n");
        // Getting decision to choo whether to delete position or element;

        int d = sc.nextInt();

        if (d == 1) {
            System.out.printf("Enter position to delete\n");
            int key = sc.nextInt();
            // calling Delete at position function
            action.deletePos(key);
            action.display();
        } else {
            System.out.printf("Enter the element to delete\n");
            val = sc.nextInt();
            // Calling Delete an element function
            action.deletePosElem(val);
            action.display();
        }
        sc.close();
    }
}