// LIFO Principle of Stack
// In programming terms, putting an item on top of the stack is called push and removing an item is called pop.

// There are some basic operations that allow us to perform different actions on a stack.

// Push: Add an element to the top of a stack
// Pop: Remove an element from the top of a stack
// IsEmpty: Check if the stack is empty
// IsFull: Check if the stack is full
// Peek: Get the value of the top element without removing it

// Working of Stack Data Structure
// The operations work as follows:

// A pointer called TOP is used to keep track of the top element in the stack.
// When initializing the stack, we set its value to -1 so that we can check if the stack is empty by comparing TOP == -1.
// On pushing an element, we increase the value of TOP and place the new element in the position pointed to by TOP.
// On popping an element, we return the element pointed to by TOP and reduce its value.
// Before pushing, we check if the stack is already full
// Before popping, we check if the stack is already empty

public class StackStructure {

    private int arr[];
    private int top;
    private int capacity;

    public static void main(String[] args){
        StackStructure stack = new StackStructure(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
    
        stack.printStack();
        stack.size();
    }

    StackStructure(int size){
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public Boolean isFull(){
        if(top == capacity - 1){
            return true;
        }

        return false;
    }

    public Boolean isEmpty(){
        if(top == - 1){
            return true;
        }

        return false;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Overflow \n Program Terminated!");
            System.exit(-1);
        }

        arr[++top] = x;
        System.out.println("Inserted " + x);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            System.exit(-1);
        }

        System.out.println("Popping out last value from stack i.e, " + arr[top]);

        return arr[top--];
    }

    public int size(){
        System.out.println("Stack size is "+ (top + 1));
        return top + 1;
    }

    public void printStack(){
        System.out.println("Printing out the current stack values.");
        for(int i = 0; i <= top; i++){
            System.out.println(arr[i]);
        }
    }
}
