import java.util.ArrayList;
import java.util.Scanner;
public class Qes4Bruteforce{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		int s=sc.nextInt();
		for(int i=0;i<s;i++)
		{
			a.add(sc.nextInt());
		}
		int c1 =0;
		int c2=0;
		for(Integer p:a)
		{
			if(p>=50)
			{
				c1++;
			}
			if(p>=100)
			{
				c2++;
			}
		}
		System.out.println(c1);
		System.out.println(c2);
	
	}
}