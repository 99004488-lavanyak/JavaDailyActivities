import java.util.*;
public class Qes1playerdeatils {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		System.out.println(" Enter the player details");
		System.out.println("Enter player name:");
		String t=sc.next();
		a.add(t);
		System.out.println("Enter age");
		t=sc.next();
		a.add(t);
		System.out.println("Enter Country");
		t=sc.next();
		a.add(t);
		System.out.println(" Player Details");
		for(String i:a)
		{
			System.out.println(i);
		}
		System.out.println(" Enter Skill");
		t=sc.next();
		System.out.println(" Enter the position to add the skill");
		int t1=sc.nextInt();
		a.add(t1, t);
		System.out.println(" Player Details");
		for(String i:a)
		{
			System.out.println(i);
		}
		System.out.println(" Enter the position of the detail to be removed");
		t1=sc.nextInt();
		a.remove(t1);
		System.out.println(" Player Details");
		for(String i:a)
		{
			System.out.println(i);
		}
		
		
		

	}
}