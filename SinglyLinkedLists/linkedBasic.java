import java.util.Scanner;

class linkedBasic{
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }
        linkedBasic(){
            head = null;
        }
    public void insert(int val){
        Node newnode = new Node(val);

        if(head == null){
            head = newnode;
        }
        else{
            Node temp = newnode;
            temp.next = head;
            head = temp;
        }
    }
    public void display(){
        if(head == null){
            System.out.printf("No element");
        }
        else{
            Node temp = head;
            while(temp.next != null){
                System.out.printf("%d ",temp.data);
                temp = temp.next;
            }
            System.out.printf("%d", temp.data);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        linkedBasic list = new linkedBsic();
        
        int n = sc.nextInt(), arr [] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            list.insert(arr[i]);

        }
        // System.out.printf();
        list.display();
        sc.close();
    }
}
