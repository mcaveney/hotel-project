import java.util.Scanner;
public class HotelDriver
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many rooms does your hotel have?");
        int numRooms = keyboard.nextInt();
        Hotel myHotel = new Hotel(numRooms);//creates hotel
        int rNumber;
        
		int choice;
		String name;
		String number;
		double rate;
		int nights;

		Guest[] myGuest = new Guest[numRooms];
		
		
        do
        {
            //menu
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Choose an action by selecting a number choice.");
            System.out.println("1. Put Guest into room.");
            System.out.println("2. Remove Guest from room.");
            System.out.println("3. Get Guest Info.");
            System.out.println("4. Get Guest Count.");
            System.out.println("5. Display Guest Book.");
            System.out.println("6. Calculate expected income.");
            System.out.println("7. Quit.");
            System.out.println("\n");
        
            choice = keyboard.nextInt();
            while(choice < 0 || choice > 7)
            {
            	System.out.println("That is not an acceptable choice! Try again.");
            	choice = keyboard.nextInt();
            }//end loop when user enters # between 1 and 7
            switch(choice)
            {
                case 1:
                //guest in room
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("What is the Guest's name?");
				keyboard.nextLine();
				name = keyboard.nextLine();
                System.out.println("What is the Guest's phone number?");
                number = keyboard.nextLine();
                System.out.println("What is the nightly rate?");
                rate = keyboard.nextDouble();
                System.out.println("How many nights is the Guest staying?");
                nights = keyboard.nextInt();
                System.out.println("What room will this guest be staying in?");
                rNumber = keyboard.nextInt();
                if(myHotel.getGuestInfoFromRoom(rNumber) == null)
                {
                	//put guest in room
                	myHotel.putGuestIntoRoom((rNumber), myGuest[rNumber]);
                	System.out.println(name + " is now in room " + rNumber + "!");
                	System.out.println("Press enter to return to the main menu.");
                	keyboard.nextLine();
                	keyboard.nextLine();
                }
                else
                {
                	System.out.println("There is already a guest in this room. Press enter to return to the main menu.");
                	keyboard.nextLine();
                	keyboard.nextLine();
                }
                break;
                
                case 2:
                //remove guest
                System.out.println("What is the room number of the guest you would like to remove?");
                rNumber = keyboard.nextInt();
                if((rNumber) > numRooms || rNumber < 0)
                {
                	System.out.println("This room doesn't exist in this hotel.\nPress enter to return to the main menu.");
					keyboard.nextLine();
					keyboard.nextLine();
					break;
                }
               else if(myHotel.getGuestInfoFromRoom(rNumber) == null)
				{
					System.out.println("This room is currently unoccupied.\nPress enter to return to the main menu.");
					keyboard.nextLine();
				}
				else
				{
					myHotel.removeGuestFromRoom(rNumber);
					System.out.println("Guest removed.\nHit enter to return to the main menu.");
                }
                keyboard.nextLine();
                keyboard.nextLine();
                break;
                
                case 3:
                //get info from specific guest
                System.out.println("What is the guest's room number?");
                rNumber = keyboard.nextInt();
                myHotel.getGuestInfoFromRoom(rNumber);
                if(rNumber > numRooms || rNumber < 0)
                {
                	System.out.println("This room doesn't exist in this hotel.\nPress enter to return to the main menu.");
					keyboard.nextLine();
					keyboard.nextLine();
					break;
                }
                else
                	if(myHotel.getGuestInfoFromRoom(rNumber) == null)
            		{
            	    	System.out.println("There is no one in room " + rNumber + ".\nPress enter to return to the main menu.");
            	    }

            		else
					{
      		          	System.out.println(myHotel.getGuestInfoFromRoom(rNumber));
       		         	System.out.println("Press enter to return to the main menu.");
    				}
                keyboard.nextLine();
                keyboard.nextLine();
                break;
                
                case 4:
                //guest count
                for(int i = 0; i < numRooms; i++)
                {
                	System.out.println("Room " + (i + 1) + ": " );
                }
                break;
                
                case 5:
                //guest book
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                for(int i = 0; i < numRooms; i++)
                {
                	System.out.println("Room " + (i+1) + ": ");
                	if(myHotel.getGuestInfoFromRoom(i) == null)
                	{
                		System.out.println("Unoccupied.");
                	}
                	else
                	{
                		System.out.println(myHotel.getGuestInfoFromRoom(i));
                	}
                }
                System.out.println("Press enter to continue.");
                keyboard.nextLine();
                keyboard.nextLine();
                break;
                
                case 6:
                //expected income
                break;
                
                case 7://quit
                System.out.println("Press enter to quit.");
                keyboard.nextLine();
                keyboard.nextLine();
                return;
            } //end switch
        }while(choice > 0 || choice < 7); //end while loop if choice is not between 1 and 6
    }//end method main
}//end class Driver