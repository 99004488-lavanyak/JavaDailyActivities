import java.util.ArrayList;
import java.util.Scanner;
public class Qes2IPLteams{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		String s=sc.next();
		a.add(s);
		s=sc.next();
		a.add(s);
		s=sc.next();
		a.add(s);
		s=sc.next();
		a.add(s);
		s=sc.next();
		a.add(s);
		System.out.println("Enter swap positions");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		String temp1=a.get(n1);
		String temp2=a.get(n2);
		a.remove(n1);
		a.add(n1,temp2);
		a.remove(n2);
		a.add(n2,temp1);
		for(String i:a)
		{
			System.out.println(i);
		}
	}
}