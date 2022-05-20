public class QueueStructure {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;

    QueueStructure(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    public Boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }

        return false;
    }

    public Boolean isFull(){
        if(rear == capacity - 1){
            return true;
        }

        return false;
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Overflow exception \n Program Terminated!");
            System.exit(-1);
        }
        // System.out.println(front + " " + rear);
        front = 0;
        ++rear;
        arr[rear] = x;
        System.out.println("Enqueued " + x);
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            System.exit(-1);
        }
        
        System.out.println("Dequeued " + arr[front]);
        
        front++;

        if(front > rear){
            front = -1;
            rear = -1;
            // System.out.println(front + " " + rear);
        }
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            System.exit(-1);
        }
        for(int i = 0; i < capacity; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        QueueStructure queue = new QueueStructure(5);
        queue.enqueue(5);  //( front, rear++)
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
       
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
    }
}
