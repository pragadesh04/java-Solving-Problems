import java.util.Scanner;

class DLL {
    class node {
        node next, prev;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
            this.prev = null;
        }
    }

    node head, tail;

    DLL() {
        head = null;
        tail = null;
    }

    public void insert(int val) {
        node newNode = new node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        node temp = tail;
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }
}

class dupeRemovalDLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL action = new DLL();

        int val = 0;
        while (true) {
            val = sc.nextInt();
            if (val == -1) {
                break;
            }
            action.insert(val);
        }
        action.display();
        sc.close();
    }
}