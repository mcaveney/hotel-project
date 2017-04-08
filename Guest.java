public class Guest
{
	private String gName;
	private String phoneNumber;
	private double nightRate;
	private int nightBooked;
	
	public Guest(Guest g)
	{
		this.gName = gName;
		this.phoneNumber = phoneNumber;
		this.nightRate = nightRate;
		this.nightBooked = nightBooked;
	}
	
	public void setGName(String gName)
	{
		this.gName = gName;
	}
	public void setphoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public void setNightRate(double nightRate)
	{
		this.nightRate = nightRate;
	}
	public void setNightBooked(int nights)
	{
		this.nightBooked = nights;
	}
	
	public String getGName()
	{
		return this.gName;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	public double getNightRate()
	{
		return this.nightRate;
	}
	public int getNightBooked()
	{
		return this.nightBooked;
	}
	
	public String toString()
	{
		return "Guest: " + this.gName + " - " + this.phoneNumber + "\nNight Rate: " + this.nightRate + "\nNights Booked: " + this.nightBooked;
	}
	
	public boolean equals(Guest g)
	{
		return ((this.gName.equals(g.gName)) &&
		(this.phoneNumber.equals(g.phoneNumber)) &&
		(this.nightRate == g.nightRate) &&
		(this.nightBooked == g.nightBooked));
	}
}