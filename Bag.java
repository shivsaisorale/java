class Bag{

	String name;
	String colour;
	String cloath;
	float price;
	Boolean Bagturist;
	
   Bag(String name,String colour,String cloath)
   {
   
   this.name=name;
   this.colour=colour;
   this.cloath=cloath;

}
	Bag2(float price,Boolean Bagturist)
	{
	System.out.println("created using float,boolean");
	this(price,Bagturist);
	this.price=price;
	this.Bagturist=Bagturist;
	}
	
}