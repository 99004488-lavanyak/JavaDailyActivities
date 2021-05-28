import java.util.*;
class InningsMain
{
   public static void main(String[] args)
   {
     Innings i=new Innings();
     Scanner sc=new Scanner(System.in);
     String teamName;
     String inName;
     int inruns;
     System.out.println("Enter TeamName:");
     teamName=sc.nextLine();
     System.out.println("Enter SessionName:");
     inName=sc.nextLine();
     System.out.println("Enter Runs Scored:");
     inruns=sc.nextInt();
     
     i.setTeamName(teamName);
     i.setInningsName(inName);
     i.setRuns(inruns);
     i.InningsDetials();
   }
}