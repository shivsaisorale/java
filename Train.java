class Train{
	String transport;
	
	void transport{
	{
	System.out.println("invoked transport");
	System.out.println("transport");
	this.start();
	

	}

static void start()
{
	System.out.println("invoked start");
	System.out.println(transport);
	stop();
	
}
static void stop()
{
	System.out.println("invoked stop");

}	
	
	
}