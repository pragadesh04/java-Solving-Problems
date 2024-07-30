
// // // class math{
// // //     public void add(int a, int b){
// // //         System.out.printf("%d\n",a+b);
// // //     }
// // //     public void sub(int a, int b){
// // //         System.out.printf("%d\n",a-b);
// // //     }
// // //     public void mul(int a, int b){
// // //         System.out.printf("%d\n",a*b);
// // //     }
// // //     public void div(int a, int b){
// // //         System.out.printf("%d\n",a/b);
// // //     }
// // //     public void modu(int a, int b){
// // //         System.out.printf("%d\n",a%b);
// // //     }
    
// // // }
// // // class oops{
// // //     public static void main(String[] args){
// // //         math ob = new math();
// // //         int c = 10, d = 20;
// // //         ob.add(c,d);
// // //         ob.sub(c,d);
// // //         ob.mul(c,d);
// // //         ob.div(c,d);
// // //         ob.modu(c,d);
// // //     }
// // // }

// // class math{
// //     int a = 20, b = 10;
// // }
// // class adds extends math{
// //     public void add(){
// //         System.out.printf("%d\n",a+b);
// //     }
// // }
// // class sub extends adds{
// //     public void subs(){
// //         System.out.printf("%d\n", a-b);
// //     }
// // }
// // class oops{
// //     public static void main(String[] args){
// //         adds ob = new adds();
// //         sub sub = new sub();
// //         ob.add();
// //         sub.subs();
// //     }
// // }

// import java.util.*;
// class oops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         long num = sc.nextLong();
//         long i = 0;
//         for(i = 1; i <= num;System.out.printf("\n"),i++){
//             for(long j = 1; j <= num-i; j++){
//                 System.out.printf(" ");
//             }
//             for(long k = 1; k <= i*2-1; k++){
//                 System.out.printf("*");
//             }
//         }
//     }
// }
import java.util.*;
class oops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][num*2];
        
        for(i=0;i <= num; i++){
            for(int j = 0; j <= num*2; j++){
                arr[i][j]=i;
            }
        }
        for(i=0;i <= num; i++){
            for(int j = 0; j <= num*2; j++){
                System.out.printf("%d ",arr[i][j]);
            }
        }
    }
}