import java.util.*;
public class Circularqueue {
    static int size=6;
    static int item[]=new int[size];
    static int front;
    static int rear;
    public static void cq(){
        front=-1;
        rear=-1;
         
    }
    public static void enqueue(int element)  
{  
    if(front==-1 && rear==-1)   
    {  
        front=0;  
        rear=0;  
        item[rear]=element; 
        return; 
    }  
    else if((front==0)&&(rear==size-1)||front==rear+1) 
    {  
        System.out.println("Queue is overflow..");  
    }  
    else  
    {  
       item[++rear]=element;  
    }  
}  
public static int dequeue()  
{  
    if((front==-1) && (rear==-1))  
    {  
        System.out.println("\nQueue is underflow..");  
    }  
 else if(front==rear)  
{  
   System.out.println("The dequeued element is "+item[front]);  
   front=-1;  
   rear=-1;  
}   
else  
{  
    System.out.println("The dequeued element is "+item[front]);  
    front++;  
} 
return 0;
} 
public static void display()
    {
        System.out.println("\nFront index-> " + front);
      System.out.println("Items -> ");
      for (int i = front; i <= rear; i++)
        System.out.print(item[i] + "  ");
      System.out.println("\nRear index-> " + rear);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        cq();
        for(int i=0;i<size;i++){
        n=sc.nextInt();
        enqueue(n);
    }
    display();
    dequeue();
    dequeue();
    display();


    
}
}