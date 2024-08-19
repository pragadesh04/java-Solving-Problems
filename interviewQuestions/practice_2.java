import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class practice_2 {
    // ++++++++++++++++++ Copy list ++++++++++++++++++++++++
    static void copyListMethod(ArrayList<Integer> list) {

        ArrayList<Integer> copyList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            copyList.add(list.get(i));
        }

        System.out.println("\n\nProgram (1) Copy Link");
        System.out.println("The original list\n" + list);
        System.out.println("The Duplicate list\n" + copyList);
    }

    // ++++++++++++++ VECTORS Questions 2,3 And 4 ++++++++++++++
    static void vectorOperations() {
        Vector<Integer> vector = new Vector<>();

        System.out.println("\n\nProgram (2) vector Operation");

        Scanner sc = new Scanner(System.in);
        int val = 0;

        while (true) {
            val = sc.nextInt();

            if (val == -1)
                break;

            vector.add(val);
        }

        // ++++++++++++++++++++++ VECTORS Size +++++++++++++++++++++

        System.out.println(vector.size());

        System.out.println("\n\nProgram (3) vector Add at Position");
        System.out.println("Enter Value and Position");
        val = sc.nextInt();
        int pos = sc.nextInt();

        // ++++++++++++++++ VECTORS Add element at pos +++++++++++++++

        System.out.println("Before adding element");
        System.out.println(vector);
        vector.add(pos, val);
        System.out.printf("after adding a position at %d\n", pos);
        System.out.println(vector);
        sc.close();

        // +++++++++++++++++++ VECTORS Dupe Vector +++++++++++++++++++++

        Vector<Integer> copyVector = new Vector<>();

        for (int i = 0; i < vector.size(); i++) {
            copyVector.add(vector.get(i));
        }

        System.out.println(copyVector);
    }

    // ++++++++++++++++++ Stack +++++++++++++++++
    static void stackOperation() {
        Stack<Integer> stack = new Stack<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int val = 0;

        while (true) {
            val = sc.nextInt();

            if (val == -1)
                break;

            list.add(val);
        }
        copyListMethod(list);
        vectorOperations();
        stackOperation();

        sc.close();

    }
}