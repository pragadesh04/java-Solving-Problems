import java.util.Iterator;
import java.util.LinkedList;

class linkedlist20{
    public static void main(String[] args){
        LinkedList<Integer> node1 = new LinkedList<>();

        node1.add(10);
        node1.add(20);

        node1.addFirst(0);
        node1.addLast(0);

        Iterator<Integer> iterator = node1.iterator();

        while(iterator.hasNext()){
            Integer element = iterator.next();
            System.out.print(" " +element);
        }
        // System.out.print(node1);
    }
}