import java.util.*;
public class CompanyMain
{
	public static void main(String args[]){
	String details;
	Scanner sc=new Scanner(System.in);
	Company c=new Company();
	details=sc.nextLine();
	String[] str=details.split(",");
	c.setName(str[0]);
	System.out.println("Name :"+c.getName());
	c.setEmployees(str[1]);
	System.out.println("Name :"+c.getEmployees());
	c.setLead(str[2]);
	System.out.println("Name :"+c.getLead());
	}
}
