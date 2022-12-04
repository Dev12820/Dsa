import java.util.*;
public class Deque {
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
public static void ifront(int element){
    {    
        if((front==0 && rear==size-1) || (front==rear+1))    
        {    
            System.out.println("Overflow");    
        }    
        else if((front==-1) && (rear==-1))    
        {    
            front=rear=0;    
            item[front]=element;    
        }    
        else if(front==0)    
        {    
            front=size-1;    
            item[front]=element;    
        }    
        else    
        {    
            front=front-1;;    
            item[front]=element;    
        }    
        
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
public static void drear()    
{    
    if((front==-1) && (rear==-1))    
    {    
        System.out.println("Deque is empty");    
    }    
    else if(front==rear)    
    {    
        System.out.println("The deleted element is"+ item[rear]);    
        front=-1;    
        rear=-1;    
            
    }    
     else if(rear==0)    
     {    
         System.out.println("\nThe deleted element is"+item[rear]);    
         rear=size-1;    
     }    
     else    
     {    
          System.out.println("\nThe deleted element is "+item[rear]);    
          rear=rear-1;    
     }    
}    
public static void display()
    {
        int i=front;
      while(i!=rear){
        System.out.print(item[i] + "  ");
        i=(i+1)%size;
      }
      System.out.println(item[rear]);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        cq();
        ifront(6);
        ifront(7);
        ifront(9);
        display();
        enqueue(5);
        enqueue(2);
        enqueue(3);
    display();
    dequeue();
    display();
    drear();
   // dequeue();
   display();
   // drear();
    //display();


    
}
}
