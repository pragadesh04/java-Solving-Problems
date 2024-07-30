class queueBasics {
    // void enqueue(){
    private int[] queue;
    private int size, capacity, front, rear;

    void simpleQueue(int capacity) {
        this.queue = new int[capacity];
        this.capacity = capacity;
        this.front = 0;
        this.size = 0;
        this.rear = -1;
    }

    boolean isFull() {
        return rear == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.printf("Queue is full: " + item);
            return;
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = item;
        }
    }
}