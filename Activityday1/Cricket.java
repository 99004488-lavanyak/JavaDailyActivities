import java.util.*;
class Cricket
{
   public static void findCricketId(int score[],int id[],int size,int x)
   {
      for(int i=0;i<size;i++)
      {
        if(x==score[i])
        {
	  System.out.println(id[i]);
        }
      }
   }
   public static void main(String args[])
   {
	int n,x;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n<0)
	{
	   System.out.println("Invalid Array Size");
	}
	else
	{
	   int l=1;
	   int id[]=new int[n];
	   int score[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
	      id[i]=sc.nextInt();
	      if(id[i]<0)
	      {
		System.out.println("Invalid Input");
		l=0;
		break;
	      }
	      score[i]=sc.nextInt();
	      if(score[i]<0)
	      {
		System.out.println("Invalid Input");
		l=0;
		break;
	      }
	   }
	   if(l==1)
	   {
		x=sc.nextInt();
		if(x<0)
		{
		   System.out.println("Invalid Score");
		}
		else
		{
		findCricketId(score,id,n,x);
		}
	   }
	}
    }
}