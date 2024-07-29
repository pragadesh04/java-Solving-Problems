import newPackages.pack;

public class postfixin {
    public static void main(String[] args) {
        String str = "ABCD-E/F*+";
        // postfixin action = new postfixin();
        pack action = new pack();
        // pack.display();

        String result = action.postfixtoin(str);
        System.out.printf("%s ", result);
    }
}