import java.util.Scanner;

abstract class Shape
{
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	abstract void  calculateArea(int value);
	
	
}
class Circle extends Shape
{
	void calculateArea(int value)
	{
		System.out.print(Math.PI*value*value);
	}
}
class Square extends Shape
{
	void calculateArea(int value)
	{
		System.out.print(value*value);
	}
}
public class abstractclassQes {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the shape");
		String t=sc.next();
		if(t.equals("Square"))
		{
			Square temp=new Square();
			int t1=sc.nextInt();
			temp.calculateArea(t1);
		}
		else
		{
			Circle temp=new Circle();
			int t1=sc.nextInt();
			temp.calculateArea(t1);
			
		}
	}
}