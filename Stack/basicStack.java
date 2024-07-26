import java.util.*;

class stack {
    private int maxsize, top = -1;
    private int[] stackArray;

    public stack(int val) {
        maxsize = val;
        stackArray = new int[maxsize];
        top = -1;
    }

    public void push(int val) {
        if (top < maxsize - 1) {
            stackArray[++top] = val;
        } else {
            System.out.print("Stack Full");
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.print("No element");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        System.out.printf("\n");
        for (int i = 0; i < top; i++) {
            System.out.printf("| %d |\n_____\n", stackArray[i]);
        }
    }
}

class basicStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = 0, count = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            count++;
            arr.add(val);
        }
        stack stack = new stack(count);
        for (int i = 0; i < count; i++) {
            int n = arr.get(i);
            stack.push(n);
        }

        int peek = stack.peek();
        System.out.printf("%d\n", peek);
        stack.display();
        System.out.printf("After deletion");
        stack.pop();
        stack.display();
    }
}