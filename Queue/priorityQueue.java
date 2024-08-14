import java.util.*;

class priorityQueue{
    class node{
        node next;
        int data, pri;

        public node(int data, int pri){
            this.next = null;
            this.data = data;
            this.pri = pri;
        }
    }
    node head;
    priorityQueue(){
        head = null;
    }

    public void PQEnqueue(int val, int pri){
        node nn = new node(val, pri);

        if(head == null) head=nn;
        else{
            if(head.pri > pri){
                nn.next = head.next;
                head = nn;
            }
            else{
                node temp = head;
                while(temp.next != null && temp.next.pri <= pri){
                    temp = temp.next;
                }
                nn.next = temp.next;
                temp.next = nn;
            }
        }
    }

    public void PQDequeue(){
        head = head.next;
    }

    public void dis(){
        node temp = head;
        System.out.print("\n");
        while(temp!=null){
            System.out.printf("The data: %d\tThe priority: %d\n", temp.data, temp.pri);
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int val = 0, pri = 0;
        priorityQueue action = new priorityQueue();

        while(true){
            System.out.print("Enter value to Add:\t");
            val = sc.nextInt();
            if(val==-1) break;
            System.out.print("Enter the priority:\t");
            pri = sc.nextInt();
            action.PQEnqueue(val,pri);
        }
        action.dis();
        System.out.print("After Dequeue at begin:\n");
        action.PQDequeue();
        action.dis();
        sc.close();
    }
}