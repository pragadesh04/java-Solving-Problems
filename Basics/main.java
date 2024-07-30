// // import java.util.*;

// // class main {
// //     public static void main(String[] args){
// //         Scanner sc = new Scanner(System.in);

// //         int num = sc.nextInt();

        
// //     }
// // }

// import printings.*;

// class main {
//     public static void main(String[] args){
//         hi h=new hi();
//         h.vanakkam();
//     }
// }
import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i =1; i<= num;i++){
            for(int j=1; j<=i;j++){
                System.out.printf("%d ",j);
            }
            for(int j = (num*2)-(i*2);j >= 1;j--){
                System.out.printf("  ");
            }
            for(int j=i; j>=1;j--){
                System.out.printf("%d ",j);
            }
            System.out.printf("\n");
        }
    }
}