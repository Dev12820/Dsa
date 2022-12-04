import java.util.*;
public class Prirority {
    static int size=6;
    static int item[]=new int[size];
    static int front;
    static int rear;
    public static void priority(){
        front=-1;
        rear=-1;  
    }
    public static void inserti(int element)
    {
        if (front==-1&&rear==-1)
        {
            front++;
        rear++;
        item[rear]=element;
        return;
        }
        else
        {     
        check(element);
        }
        rear++;

    }
    public static void check(int data)
{
    int i,j;
 
    for (i = 0; i <= rear; i++)
    {
        if (data >= item[i])
        {
            for (j = rear + 1; j > i; j--)
            {
                item[j] = item[j - 1];
            }
            item[i] = data;
            return;
        }
    }
    item[i] = data;
}
    int delete()
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
        int n;
        Scanner sc=new Scanner(System.in);
        priority();
        for(int i=0;i<size;i++){
        n=sc.nextInt();
            inserti(n);
            display();
        }
             //inserti(15);
           // display();
           // inserti(11);
           // display();
            //inserti(14);
            //display();
            //inserti(12);

       // q.insert(6);
       // q.insert(5);
       // q.insert(1);
       // q.insert(3);
          display();
          //q.delete();
          //q.display();
          //q.delete();
          //q.display();
          //q.delete();
          //q.display();
          //q.delete();
          //q.display();
          //q.delete();
          //q.display();   
    }
}

