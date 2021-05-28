public class Innings
{
   private String teamname;
   private String inningsname;
   private int runs;

   public String getTeamName()
   {
     return teamname;
   }
   public void setTeamName(String iname)
   {
      this.teamname=iname;
   }
   public String getInningsName()
   {
     return inningsname;
   }
   public void setInningsName(String inningsname)
   {
      this.inningsname=inningsname;
   }
   public int getRuns()
   {
     return runs;
   }
   public void setRuns(int runs)
   {
      this.runs=runs;
   }

   public void InningsDetials()
   {
      if(inningsname.equals("First"))
      {
         System.out.println("Name:"+teamname);
         System.out.println("Scored:"+runs);
         System.out.println("Need "+(runs+1)+" to win");
      }
      else
      {
         System.out.println("Name :"+teamname);
         System.out.println("Scored :"+runs);
         System.out.println("Match ended");
      }
   }
}