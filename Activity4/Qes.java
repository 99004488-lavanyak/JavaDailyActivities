import java.util.Scanner;

abstract class Vehicle
{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;

	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}

	public void displayMake(){
		System.out.println("***"+this.make+"***");
		
	}

	public void displayBasicInfo(){
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number: "+ this.vehicleNumber);
        System.out.println("Fuel Capacity: "+this.fuelCapacity);
		System.out.println("Fuel Type: "+this.fuelType);
		System.out.println("CC: "+this.cc);
	}

	public abstract void displayDetailInfo();
	
	
}
class TwoWheeler extends Vehicle
{
	private boolean kickStartAvailable;
	

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
        if(kickStartAvailable){
            System.out.println("Kick Start Available:YES");
        }
	else{
            System.out.println("Kick Start Available:NO");
        }
	}
}
class FourWheeler extends Vehicle
{
	private String audioSystem;
	private int numberOfDoors;
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("Audio System: "+audioSystem);
		System.out.println("Number of Doors: "+numberOfDoors);
	}
}

class Qes {
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		int choice=sc.nextInt();
        	String make,number,audio,ftype,ksa;
        	int ftypech,capacity,cc,doors;
        	switch(choice){
            	case 1:
                System.out.println("Vehicle Make");
                make=sc.next();
                System.out.println("Vehicle Number");
                number=sc.next();
                System.out.println("Fuel Type: \n 1.Petrol \n 2.Diesel");
                ftypech=sc.nextInt();
                if(ftypech==1)
                {
                    ftype="Petrol";
                }
                else
                {
                    ftype="Diesel";
                }
                System.out.println("Fuel Capacity");
                capacity=sc.nextInt();
                System.out.println("Engine CC");
                cc=sc.nextInt();
                System.out.println("Audio System");
                audio=sc.next();
                System.out.println("Number of Doors");
                doors=sc.nextInt();
                FourWheeler car=new FourWheeler(make,number,ftype,capacity,cc,audio,doors);
                car.displayMake();
                car.displayBasicInfo();
                car.displayDetailInfo();
            	break;
            	case 2:
                System.out.println("Vehicle Make");
                make=sc.next();
                System.out.println("Vehicle Number");
                number=sc.next();
                System.out.println("Fuel Type: \n 1.Petrol \n 2.Diesel");
                ftypech=sc.nextInt();
                if(ftypech==1)
                {
                    ftype="Petrol";
                }
                else
                {
                    ftype="Diesel";
                }
                System.out.println("Fuel Capacity");
                capacity=sc.nextInt();
                System.out.println("Engine CC");
                cc=sc.nextInt();
                System.out.println("Kick Start Available");
                ksa=sc.next();
                
                if(ksa.equals("yes"))
                {
                TwoWheeler bike=new TwoWheeler(make,number,ftype,capacity,cc,true);
                bike.displayMake();
                bike.displayBasicInfo();
                bike.displayDetailInfo();
                }
                else
                {
                    TwoWheeler bike=new TwoWheeler(make,number,ftype,capacity,cc,false);
                    bike.displayMake();
                    bike.displayBasicInfo();
                    bike.displayDetailInfo();
                }
            break;
        }

        sc.close();
	}

}