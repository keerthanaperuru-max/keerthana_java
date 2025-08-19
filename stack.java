public class stack {
    int top;
    int capacity;
    int arr[];
    stack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }
    boolean isFull(){
        return top == capacity-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void push(int item){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = item;
        System.out.println(item+ "pushed.");
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();

        System.out.println("Top element is: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        s.display();
    }
}
