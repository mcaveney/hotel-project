public class Hotel
{
	private Guest[] rooms;
	private String book;
	public Hotel(int numberOfRooms)
	{
		this.rooms = new Guest[numberOfRooms];
	}
	public void putGuestIntoRoom(int roomNumber, Guest guest)
	{
		this.rooms[roomNumber] = guest;
	}
	public void removeGuestFromRoom(int roomNumber)
	{
		this.rooms[roomNumber] = null;
	}
	public Guest getGuestInfoFromRoom(int roomNumber)
	{
		return rooms[roomNumber];
	}
	public int getGuestCount()
	{
		return 5;
	}
	public String getGuestBook()
	{
		for(int i = 0; i < rooms.length; i++)
		{
			book += rooms[i];
		}
		return book;	
	}
	public double getExpectedIncome()
	{
		return 2.3;
	}
}