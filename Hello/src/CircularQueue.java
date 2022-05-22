public class CircularQueue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    
    public static void main(String[] args){
        System.out.println("Circular Queue!");
        CircularQueue cqueue = new CircularQueue(5);
        // cqueue.dequeue();
        cqueue.enqueue(1);
        cqueue.enqueue(2);
        cqueue.enqueue(3);
        cqueue.enqueue(4);
        cqueue.enqueue(5);
        cqueue.enqueue(6);
        cqueue.dequeue();
        cqueue.enqueue(9);
        cqueue.enqueue(7);
        cqueue.printCQueue();
    }

    CircularQueue(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    public boolean isFull(){

        if(rear == capacity - 1 && front == 0){
            return true;
        }

        if(front == rear + 1){ // This is for circular round once dequeued area is filled check condition
            return true;
        }

        return false;
    }

    public boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }

        return false;
    }

    public void enqueue(int x){
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1){
                front = 0;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            System.out.println("Inserted " + x);
        }
        
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(-1);
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        }else { /* Q has only one element, so we reset the queue after deleting it. */
            front = (front + 1) % capacity;
        }
        
        System.out.println("Deleted element "+ arr[front-1]);

    }

    public void printCQueue(){
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Array -> ");
            for(int i = front; i <= rear; i++)
                System.out.print(arr[i] + " ");
        }
    }
}
