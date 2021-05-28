import java.util.*;
public class Activity1 {
    public static void main(String args[]) {
      int n,a,c=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(n<0)
      {
          System.out.println("Invalid Input");
      }
      else{
          int f=1;
          int arr[]=new int[n];
          for(int i=0;i<n;i++)
          {
              arr[i]=sc.nextInt();
              if(arr[i]<0)
              {
                  System.out.println("Invalid Input");
                  f=0;
                  break;
              }
          }
          if(f==1)
          {
              a=sc.nextInt();
              for(int i=0;i<n;i++)
              {
                  if(arr[i]==a)
                     c++;
              }
              System.out.println(c);
          }
    }
}
}