import java.io.*;

class EmployeesMain
{
   public static void main(String[] args) throws Exception
   {
      Employees e=new Employees();
      String ename;
      String eaddress;
      String emobile;
      int ch;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      ename=br.readLine();
      eaddress=br.readLine();
      emobile=br.readLine();
      
      e.setName(ename);
      e.setAddress(eaddress);
      e.setMobile(emobile);
      System.out.println("Employee Details:");
      System.out.println("Name:"+e.getName());
      System.out.println("Address:"+e.getAddress());
      System.out.println("Mobile:"+e.getMobile());
      System.out.println("Verify and update Details");
      
      do
      {
         System.out.println("MENU");
         System.out.println("1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All information correct \n5. Exit");
         
         ch=Integer.parseInt(br.readLine());
         switch(ch)
         {
            case 1: System.out.println("Current Employee Name:"+e.getName());
                    System.out.println("Enter Name:");
                    String nName;
                    nName=br.readLine();
                    e.setName(nName);
                    break;
            case 2: System.out.println("Current Employee Address:"+e.getAddress());
                    System.out.println("Enter Address:");
                    String nAddress=br.readLine();
                    e.setAddress(nAddress);
                    break;
            case 3: System.out.println("Current Employee Mobile:"+e.getMobile());
                    System.out.println("Enter Mobile:");
                    String nMobile=br.readLine();
                    e.setMobile(nMobile);
                    break;
            case 4: System.out.println("Details are:");
                     System.out.println("Name :"+e.getName());
                     System.out.println("Address :"+e.getAddress());
                     System.out.println("Mobile :"+e.getMobile());
         }
      }while(ch!=5);
   }
}