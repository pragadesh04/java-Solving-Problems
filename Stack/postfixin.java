import java.util.Stack;

public class postfixin {
    public boolean isOper(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public String postfixtoin(String postfix) {
        Stack<String> stack = new Stack<>();
        // String post;

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (!isOper(c)) {
                stack.push(c + "");
            } else {
                String ope2 = stack.pop();
                String ope1 = stack.pop();
                String post = "(" + ope1 + c + ope2 + ")";
                stack.push(post);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String str = "ABCD-E/F*+";
        postfixin action = new postfixin();

        String result = action.postfixtoin(str);
        System.out.printf("%s ", result);
    }
}