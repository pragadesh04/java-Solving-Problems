import java.util.*;

class vow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        long len = str.length();
        
        try{
            handle(len,str);
            System.out.printf("String contains vowels");
        }
        catch(Exception e){
            System.out.printf("Error:String does not contain vowels");
        }
    }
    public static void handle(long n,String str)throws Exception{
        char vow [] = {'a','e','i','o','u','A','E','I','O','U'};
        int flag = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<10; j++){
                if(str.charAt(i)==vow[j]){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0){
            throw new Exception();
        }
    }
    
}