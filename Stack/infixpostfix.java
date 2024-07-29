import newPackages.pack;

class infixpostfix {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String str = "A+B(C-D)/E*F";
        // infixpostfix ip = new infixpostfix();
        pack IP = new pack();

        String result = IP.infixtopost(str);
        System.out.printf("The original Expression is:\n%s\nAfter conversion is:\n %s\n", str, result);
        // sc.close();
    }
}