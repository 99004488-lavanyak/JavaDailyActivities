import java.util.*;

class javaqes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        String lastname1 = "", lastname2 = "";
        for(String lname : n1.split(" ")){
            lastname1 = lname;
        }
        for(String lname : n2.split(" ")){
            lastname2 = lname;
        }

        if(lastname1.equals(lastname2)){
            System.out.println("Yes");
        }
	else{
            System.out.println("No");
        }

    }
}