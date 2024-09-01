package Queue;
public class ArrayImpli{
   static class Queue{
    static int arr[];
     static int rear;
    static int size;
    Queue(int n){
        arr=new int[n];
        size=n;
        rear =size-1;
    }

    // isEmpty
    public static boolean isEmpty(){
        return rear == -1;
    }
    //add O(1)
    public static void add(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
            return;
        }
        rear =rear+1;
        arr[rear]=data;
    }

    //remove O(n)
    public static int remove(){
        if(rear == -1){
            System.out.println("Empty Queue");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear = rear-1;
        return front;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty Queue");
            return -1;
        }
        return arr[0];

        }
    }
   

    public static void main(String[] args) {
       Queue q=new Queue(10);
       q.add(1);
        q.add(2);
        q.add(3);
        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();   
        }
    }
}