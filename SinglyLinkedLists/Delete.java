import java.util.Scanner;

class Delete{
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    Delete() {
        head = null;
    }

    public void insert(int val){
        Node newnode = new Node(val);
        Node temp = newnode;
        temp.next = head;
        head = temp;
    }

    public void deleteBeg() {
        head = head.next;
    }

    public void deleteEnd() {
        Node temp = head;
        Node prev = null;
        while(temp != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void deletePos(int pos) {
        if (pos == 0) {
            deleteBeg();
            return;
        }
        Node currNode = head;
        for (int i = 1; i < pos && currNode != null; i++) {
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println("Invalid position");
            return;
        }
        else{
            currNode.next = null;
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
        Delete del = new Delete();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), val=0;

        for(int i=0; i<n; i++){
            val = sc.nextInt();
            del.insert(val);
        }

        del.display();
        System.out.printf("\nElements after delete Beging\n");
        // int n = sc.nextInt(), val = 0;
        del.deleteBeg();
        del.display();

        System.out.printf("\nElement after delete at End\n");
        del.deleteEnd();
        del.display();

        System.out.printf("\nEnter position to delete\n");
        int pos = sc.nextInt();
        del.deletePos(pos);
        del.display();
    }
}