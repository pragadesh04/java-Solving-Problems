import java.util.Scanner;

class scl {
    class node {
        node next;
        int data;

        public node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    node head, last;

    scl() {
        head = null;
        last = null;
    }

    public void insert(int val) {
        node n = new node(val);
        if (head == null) {
            head = n;
            last = n;
        } else {
            last.next = n;
            n.next = head;
            last = n;
        }
    }

    public void middle(int pos) {
        node temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);
    }
}

class midElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        scl action = new scl();
        int val = 0, count = 0;

        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            action.insert(val);
            count++;
        }

        action.middle(count / 2);
        sc.close();
    }
}