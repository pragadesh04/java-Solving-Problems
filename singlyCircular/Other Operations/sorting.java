import java.util.Scanner;

class Sort {
    class node {
        node next;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    node head, last;

    Sort() {
        head = null;
        last = null;
    }

    public void SORT() {
        node current, index;
        for (current = head; current.next != head; current = current.next) {
            for (index = current.next; index != head; index = index.next) {
                if (current.data > index.data) {
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
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
    }
}

class sorting {
    public static void main(String[] args) {
        Sort action = new Sort();
        Scanner sc = new Scanner(System.in);
        int val = 0;
        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insertBeg(val);
        }
        action.display();
        System.out.printf("\nafter sorting\n");
        action.SORT();
        action.display();
        sc.close();
    }
}