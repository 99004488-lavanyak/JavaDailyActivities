import java.util.*;
abstract class Matchqes
{
	private int currentscore;
	private int currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getCurrentover() {
		return currentover;
	}
	public void setCurrentover(int currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate,int balls);
	
}
class ODIMatch extends Matchqes
{
	public float calculateRunRate()
	{
		return (getTarget()-getCurrentscore())/(50-getCurrentover());
	}
	public int calculateBalls()
	{
		return (50-getCurrentover())*6;
	}
	public void display(double d1,int d2)
	{
		System.out.print("Need ");
		System.out.print((int)(d1*d2/6));
		System.out.println(" runs in "+d2+" balls");
		System.out.println("Required Runrate: "+d1);
	}
}
class TestMatch extends Matchqes
{
	public float calculateRunRate()
	{
		return (getTarget()-getCurrentscore())/(100-getCurrentover());
	}
	public int calculateBalls()
	{
		return (100-getCurrentover())*6;
	}
	public void display(double d1,int d2)
	{
		System.out.print("Need ");
		System.out.print((int)(d1*d2/6));
		System.out.println(" runs in "+d2+" balls");
		System.out.println("Required Runrate: "+d1);
	}
	
}
class T20Match extends Matchqes
{
	public float calculateRunRate()
	{
		return (getTarget()-getCurrentscore())/(20-getCurrentover());
	}
	public int calculateBalls()
	{
		return (20-getCurrentover())*6;
	}
	public void display(double d1,int d2)
	{
		System.out.print("Need ");
		System.out.print((int)(d1*d2/6));
		System.out.println(" runs in "+d2+" balls");
		System.out.println("Required Runrate: "+d1);
	}
	
}
public class Actabstractqes2 {
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. ODI");

		System.out.println("2. T20");

		System.out.println("3. Test");
		int t=sc.nextInt();
		if(t==1)
		{
			ODIMatch temp=new ODIMatch();
			int t1=sc.nextInt();
			int t2=sc.nextInt();
			int t3=sc.nextInt();
			temp.setTarget(t3);
			temp.setCurrentscore(t1);
			temp.setCurrentover(t2);
			double t4=temp.calculateRunRate();
			int t5=temp.calculateBalls();
			temp.display(t4, t5);
		}
		if(t==2)
		{
			T20Match temp=new T20Match();
			int t1=sc.nextInt();
			int t2=sc.nextInt();
			int t3=sc.nextInt();
			temp.setTarget(t3);
			temp.setCurrentscore(t1);
			temp.setCurrentover(t2);
			double t4=temp.calculateRunRate();
			int t5=temp.calculateBalls();
			temp.display(t4, t5);
		}
		if(t==1)
		{
			TestMatch temp=new TestMatch();
			int t1=sc.nextInt();
			int t2=sc.nextInt();
			int t3=sc.nextInt();
			temp.setTarget(t3);
			temp.setCurrentscore(t1);
			temp.setCurrentover(t2);
			double t4=temp.calculateRunRate();
			int t5=temp.calculateBalls();
			temp.display(t4, t5);
		}
		
		
		
	}

}