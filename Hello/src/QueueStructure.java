// Basic Operations of Queue
// A queue is an object (an abstract data structure - ADT) that allows the following operations:

// Enqueue: Add an element to the end of the queue
// Dequeue: Remove an element from the front of the queue
// IsEmpty: Check if the queue is empty
// IsFull: Check if the queue is full
// Peek: Get the value of the front of the queue without removing it
// Working of Queue
// Queue operations work as follows:

// two pointers FRONT and REAR
// FRONT track the first element of the queue
// REAR track the last element of the queue
// initially, set value of FRONT and REAR to -1
// Enqueue Operation
// check if the queue is full
// for the first element, set the value of FRONT to 0
// increase the REAR index by 1
// add the new element in the position pointed to by REAR
// Dequeue Operation
// check if the queue is empty
// return the value pointed by FRONT
// increase the FRONT index by 1
// for the last element, reset the values of FRONT and REAR to -1


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
