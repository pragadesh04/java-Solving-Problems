import java.util.Stack;

class infixpostfix {

    public String infixtopost(String str) {
        // String str_new;
        StringBuilder postfix = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(' && check(st.peek(), c)) {
                    postfix.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty() && st.peek() != '(' && check(st.peek(), c)) {
                    postfix.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }
        return postfix.toString();
    }

    public boolean check(char c, char Symbol) {
        return precedence(c) >= precedence(Symbol);
    }

    public int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String str = "A+B(C-D)/E*F";
        infixpostfix ip = new infixpostfix();

        String result = ip.infixtopost(str);
        System.out.printf("The original Expression is:\n%s\nAfter conversion is:\n %s\n", str, result);
        // sc.close();
    }
}