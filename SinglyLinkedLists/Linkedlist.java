import java.util.ArrayList;
import java.util.Scanner;

class Linkedlist{
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    Linkedlist(){
        head = null;
    }

    public void insertbeg(int val){
        Node newnode = new Node(val);
        // Node temp = head;

        if(head == null){
            head = newnode;
        }
        else{
            Node temp = newnode;
            temp.next = head;
            head = temp;
        }
    }

    public void insertend(int val){
        Node newnode = new Node(val);
        Node temp = head;
        Node addNode = newnode;
        if(head == null){
            head = newnode;
            System.out.printf("No element");
        }
        else{
            while(temp.next != null){
                temp = temp.next;
                // System.out.printf("\n moving next...");
            }
            temp.next = addNode;
        }
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.printf("No elements in Linked list");
            return;
        }
        else{
            while(temp != null){
                System.out.printf("%d-->",temp.data);
                temp = temp.next;
            }
            System.out.printf("null");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val = 0;
        int count =0;
        ArrayList<Integer> arr = new ArrayList<>();

        Linkedlist list = new Linkedlist();
        while(val != -1){
            val = sc.nextInt();
            // list.insertbeg(val);
            arr.add(val);
            count++;
        }
        for(int i = 0; i<count-1; i++){
            // System.out.printf("%d ",arr.get(i));
            list.insertbeg(arr.get(i));
            // list.insertend(arr.get(i));
        }
        list.display();
        sc.close();
    }
}