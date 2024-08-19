import java.util.*;


class allMethods{
    HashMap<String, Integer> program_1(Scanner sc){

        HashMap<String, Integer> map = new HashMap<>();

        int price;
        String dish;

        System.out.println("Enter the Price and Dish name");

        while(true){
            price = sc.nextInt();

            if(price == -1) break;

            dish = sc.next();

            map.put(dish, price);
        }

        return map;
    }

    Set<Integer> program_2(Scanner sc) {
    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> set_ = new HashSet<>();


    System.out.println("Enter the numbers to add to the set (enter -1 to stop):");

    int val;
    while (true) {
        if (sc.hasNextInt()) {
            val = sc.nextInt();
            if (val == -1) break;
            set.add(val);
        } else {
            System.out.println("Please enter a valid integer.");
            sc.next(); // Consume the invalid input
        }
    }

    for(int i = (set.size())-1; i>=0; i--){
        sc_.add(set[i]);
    }
    return set_;
    }
}

public class practice_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        allMethods action = new allMethods();

        System.out.println(action.program_1(sc));
        System.out.println(action.program_2(sc));
    }
}