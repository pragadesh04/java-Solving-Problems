import newPackages.pack;

public class infixtopre {
    public static void main(String[] args) {
        pack action = new pack();
        String str = "A+B(C-D)/E*F";
        action.display("\nThe Original String");
        action.display(str);
        action.display("\nAfter reversing the infix");
        action.display(action.revInfix(str));
        action.display("\nConverting the str to postfix");
        action.display(action.infixtopost(action.revInfix(str)));
        action.display("\nAfter Getting the result");
        action.display(action.revString(action.infixtopost(action.revInfix(str))));
    }
}