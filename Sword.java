class Sword{

	String cut;
	String handel;
	String drop;
	

	void cut()
	{
	System.out.println("invoking cut");
	
	}
	static void handel()
	{
	System.out.println("invoking handel");
	}
	void drop()
	{
	System.out.println("invoking drop");
	cut();
	handel();
	throwing();
	}
	static void throwing()
	{
	System.out.println("invoking throwing");
	}
	public static void main(String[] dosa)
	{
	Sword swordref=new Sword();
    swordref.drop();	
	}
}