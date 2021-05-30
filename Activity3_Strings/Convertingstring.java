import java.io.*;
public class Convertingstring {

	public static void main(String[] args) throws Exception {
		
		String Firstname;
		String Lastname;
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		Firstname=sc.readLine();
		Lastname=sc.readLine();
		System.out.println(Firstname.toLowerCase()+" "+Lastname.toUpperCase());
	}

}