
class resource{
    private int count = 0;
    public synchronized void method(String threadname){
        count++;
        System.out.printf("%s count incremented to %d \n",threadname,count);
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.printf("%s Interrupted", threadname);
        }
    }
}

class multi {
    public static void main(String[] args){
        resource resource = new resource();
        Runnable task1 = () ->{
            for(int i=0; i<=5; i++){
                resource.method("Thread1");
            }
        };
        Runnable task2 = () ->{
            for(int i=0;i<=5;i++){
                resource.method("Thread2");
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        
        thread1.start();
        thread2.start();
    }
}