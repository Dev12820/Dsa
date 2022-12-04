import java.util.*;
public class Queue {
    static int size=5;
    static int item[]=new int[size+1];
    static int front,rear;
    Queue(){
        front=0;
        rear=0;  
    }
    public static void insert(int element)
    {
        if (front==0)
        {
            front=1;
        }
        rear++;
        item[rear]=element;
        System.out.println("insert "+element);
    }
    public static int delete()
    {
        int element;
        element=item[front];
        if(front>=rear)
        {
            front=0;
            rear=0;
        }
        else
        {
        front++;
      }
      System.out.println( element + " Deleted");
      return (element);
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
        Queue q=new Queue();
        for(int i = 1; i < 6; i ++) {
            insert(i);
          }
          display();
          delete();
          display();
          delete();
          display();
          delete();
          display();
          delete();
          display();
          delete();
          q.display();


        
    }
    
    
}
