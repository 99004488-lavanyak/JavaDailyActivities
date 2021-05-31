public class HotelRoom {

	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTraiff() {
		int res;

		res= numberOfSqFeet * getRatePerSqFeet();
		return res;
		
	}
	public int getRatePerSqFeet()
	{
		return 0;
	}
	
}

class DeluxeRoom extends HotelRoom{
	
	protected int ratePerSqFeet;

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
	
	public int getRatePerSqFeet()

	{
		if(hasWifi=true)
		{
			return ratePerSqFeet+2;
		}
		else
			return ratePerSqFeet;
	}
	
	
	
}

class DeluxeACRoom extends DeluxeRoom{
	
	protected int ratePerSqFeet;

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet,
			int ratePerSqFeet2) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
		this.ratePerSqFeet = 12;
	}
	
	
}

class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet;

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	public int getRatePerSqFeet()

	{
		if(hasWifi)
		{
			return ratePerSqFeet+2;
		}
		else
			return ratePerSqFeet;
	}
	
}