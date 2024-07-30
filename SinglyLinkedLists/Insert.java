import java.util.Scanner;

class Insert {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    Insert() {
        head = null;
    }

    public void insertBeg(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertPos(int pos, int val) {
        if (pos == 0) {
            insertBeg(val);
            return;
        }
        Node newNode = new Node(val);
        Node currNode = head;
        for (int i = 1; i < pos && currNode != null; i++) {
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println("Invalid position");
            return;
        }
        else{
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.printf("%d ",temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Insert ins = new Insert();
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("\nEnter number of elements\n");
        int n = sc.nextInt(), val = 0;

        for(int i = 0; i<n; i++){
            val = sc.nextInt();
            ins.insertBeg(val);
        }
        ins.display();

        System.out.printf("\nEnter element to add at end\n");
        val = sc.nextInt();
        ins.insertEnd(val);
        ins.display();

        System.out.printf("\nEnter element and position\n");
        n = sc.nextInt(); val=sc.nextInt();
        ins.insertPos(n, val);
        ins.display();
    }
}