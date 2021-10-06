class BikeRunner{

	public static void main(String[] values)
{
	Bike.brake(19);
	boolean value=Bike.start();
	System.out.println(value);
	boolean good=false;
	System.out.println(value==good);
	
	int spd=Bike.currentSpeed();
	System.out.println(spd);


}

}