package Queue;

public class Operation {
   static  class Queue{
   static int arr[];
   static int size;
   static int rear;
   Queue(int n){
    arr=new int[n];
    size=n;
    rear=-1;
   }
   public static boolean isEmpty(){

    return rear == -1;
   }
   public static void add(int data){
    if(rear== size-1){
         System.out.println("Queue is Full!");
         return;
    }
    rear= rear+1;
    arr[rear]=data;
   }
   
   //remove
    public static int remove(){
        if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
        }
        int front =arr[0];
for(int i=0;i<rear;i++){

}
rear = rear-1;
return front;
   }
   //peek
   public static int peek(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
    return arr[0];
   }
}

    public static void main(String[] args) {
        Queue q=new Queue(8);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(80);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            
            q.remove();
        }
    }
}

