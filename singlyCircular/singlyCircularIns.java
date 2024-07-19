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
    }
}

class singlyCircularIns {
    public static void main(String[] args) {
        SCL action = new SCL();
        Scanner sc = new Scanner(System.in);
        int val = 0;
        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insertBeg(val);
        }
        action.display();
        sc.close();
    }
}