import java.io.*;
public class Actstrings {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String a1=br.readLine();
		String b1=br.readLine();
		String[] a2=a1.split(" ");
		String[] b2=b1.split(" ");
		if(a2[1].equalsIgnoreCase(b2[1]))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");			
		}
		
	}

}