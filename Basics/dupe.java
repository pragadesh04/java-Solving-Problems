import java.util.*;

class dupe {
    static int value = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr [] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        try{
            dupelicate(arr, n);
            System.out.printf("There is no repeated element");
        }
        catch(Exception e){
            System.out.printf("Error: There is duplicate number: %d",value);
        }

        sc.close();
    }
    public static void dupelicate(int[] array, int n)throws Exception{
        int val=0,vall = 0;
        for(int i=0; i<n; i++){
            System.out.printf("%d ",array[i]);
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(array[i]==array[j]){
                    vall = array[i];
                    val = 1;
                    break;
                }
            }
            if(val == 1){
                break;
            }
        }
        value = vall;
        if(val!=0){
            throw new Exception();
        }
    }
}