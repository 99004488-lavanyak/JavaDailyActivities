import java.util.*;
class EmployeeMain
{
	
	public static void main(String args[])
	{
		
		Employee e=new Employee();
		String ename;
  		String eaddress;
   		String emobile;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		ename=sc.nextLine();
	
		System.out.println("Enter address");
		eaddress=sc.nextLine();
	
		System.out.println("Enter mobile");
		emobile=sc.nextLine();
		
			
		System.out.println("Employee details");
		e.setName(ename);
		System.out.println( "name:"+e.getName());
		e.setAddress(eaddress);
		System.out.println( "address:"+e.getAddress());
		e.setMobile(emobile);
		System.out.println( "mobile:"+e.getMobile());
	
	}
}

