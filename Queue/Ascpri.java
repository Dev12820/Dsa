import java.util.*;
public class Ascpri {
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
    int i;
    for( i =rear; i >= 0; i-- ){
        
        if(data < item[i]){
           item[i+1] = item[i];
           item[i]=data;
        }else{
           break;
        }            
     }  
    item[i+1] = data; 
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
          display();
         
    }
}
