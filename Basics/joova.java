
class joova {
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        // int num = scanner.nextInt();

        int a=10,b=0,c=0;
        try{
            int arr [] = null;
            c = a/b;
            System.out.printf("%d ",arr[1]);
        }
        catch(ArithmeticException e){
            System.out.printf("by 0\n");
        }
        catch(NullPointerException e){
            System.out.printf("null\n");
        }
        catch(Exception e){
            System.out.printf("3 pak uu too\n");
        }
        finally{
            
        }
    }
}