import java.util.Scanner;

class DoLL {
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

    DoLL() {
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

    public int[] minmax() {
        node temp = head;
        // node temp2 = temp.next;
        int min = 10000, max = -1;
        while (temp != null) {
            if (temp.data < min) {
                min = temp.data;
            }
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        int value[] = { min, max };
        return value;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }
}

class minmaxDoLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoLL action = new DoLL();

        int val = 0;
        while (true) {
            val = sc.nextInt();
            if (val == -1) {
                break;
            }
            action.insert(val);
        }
        action.display();

        int values[] = action.minmax();
        System.out.printf("\nMinimun is %d\nMaximum is %d\n", values[0], values[1]);
        sc.close();
    }
}