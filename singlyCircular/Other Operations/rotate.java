import java.util.Scanner;

class rotating {
    class node {
        node next;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    node head, last;

    rotating() {
        head = null;
        last = null;
    }

    public void insert(int val) {
        node newnode = new node(val);

        if (head == null) {
            head = newnode;
            last = newnode;
        } else {
            last.next = newnode;
            newnode.next = head;
            last = newnode;
        }
    }

    public void rotate() {
        // node temp = head;
        head = last;
    }

    public void display() {
        node temp = head;
        do {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        } while (temp != head);
    }
}

class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rotating action = new rotating();

        int val = 0;
        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insert(val);
            // count++;
        }
        action.rotate();
        action.display();
        sc.close();
    }
}