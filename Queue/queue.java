import java.util.*;

class queue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int val = sc.nextInt();
        int val = 0;
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter the elements:\t");
        while(true){
            val = sc.nextInt();
            if(val == -1)break;
            queue.add(val);
        }
        // queue.add(val);

        System.out.print("\nqueue:\t" + queue);
        System.out.print("\nDequeue:\t" + queue.poll() + "\n" + queue);
        System.out.print("\nPeek element:\t" + queue.peek() + "\n" + queue);
    }
}