import java.util.Scanner;

class MinMax {
    class node {
        node next;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    node head, last;

    MinMax() {
        head = null;
        last = null;
    }

    public int[] minMax() {
        node temp = head;
        // node temp2 = temp.next;
        int min = 10000, max = -1;
        do {
            if (temp.data < min) {
                min = temp.data;
            }
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        } while (temp != head);

        int value[] = { min, max };
        return value;
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

class minmax {
    public static void main(String[] args) {
        MinMax action = new MinMax();
        Scanner sc = new Scanner(System.in);
        int val = 0;
        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insertBeg(val);
        }
        action.display();
        // System.out.printf("\nafter \n");
        int[] value = action.minMax();
        System.out.printf("\n\nMinimum is: %d\nMaximum is: %d", value[0], value[1]);
        // action.display();
        sc.close();
    }
}