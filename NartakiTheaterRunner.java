class NartakiTheaterRunner{

	public static void main(String args[])
	{
	Theater theater=new theater("Nartaki",Ticketprice.BOX);
	
	theater.location="mejestic";
	System.out.println(theater);
	System.out.println(theater.name);
	System.out.println(theater.location);
	System.out.println(theater.capacity);
	System.out.println(theater.ticketPrice.price);
	System.out.println(theater.ticketPrice.tax);

	
	
	}



}