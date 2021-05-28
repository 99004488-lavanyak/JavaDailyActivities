import java.util.*;
class CustomersMain
{
  public static void main(String[] args){
   Customers cs=new Customers();
   String dts;
 
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Details:");

   dts=sc.nextLine();
   String[] ct=dts.split(",");
   System.out.println("Customer Details");

   cs.setName(ct[0]);

   System.out.println("Name:"+cs.getName());
   cs.setAddress(ct[1]);
   System.out.println("Address:"+cs.getAddress());
   cs.setMobile(ct[2]);
   System.out.println("Mobile:"+cs.getMobile());
 }
}