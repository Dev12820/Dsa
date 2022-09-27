import java.util.*;
public class Weekday {
    public static void main(String[] args)
     {
        int d,m,y,n=0,ly=0,td;
		Scanner sc=new Scanner (System.in);
		d=sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		
		for(int i=1;i<m-1;i++)
		{
		    
		    if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
		    n=n+31;
		    else if(i==2&&(y%4==0&&y%100!=0||y%400==0))
		    n=n+29;
		    else
                n=n+28;
        }
        while(y>=2001)
        {
            if(y%4==0) 
            ly=ly+1;
            y--;  
        }
          td=d+n+ly+(y-2001)*365;
          switch(td%7)
          {
          case 0:
          System.out.println("Monday");
          break;
          case 1:
          System.out.println("Tuesday");
          break;
          case 2:
          System.out.println("wednesday");
          break;
          case 3:
          System.out.println("thursday");
          break;
          case 4:
          System.out.println("Friday");
          break;
          case 5:
          System.out.println("Saturday");
          break;
          case 6:
          System.out.println("Sunday");
          break;
          default:
          System.out.println("Unknown");
          }
        sc.close();
        
        }

    
}
