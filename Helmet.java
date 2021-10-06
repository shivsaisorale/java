class Helmet{

	String name;
	String colour;
	String brand;
	float price;
	Helmettypes TYPES;
	
	void Helmets(){
	System.out.println("invked nailcut");
	System.out.println("helmet deatils");
    System.out.println(name);
	System.out.println(colour);
	System.out.println(brand);
	System.out.println(price);
	System.out.println(Helmettypes.FULL);
	
}

enum Helmettypes{

	HALF,OFF_ROAD,DUAL_SPORT,FULL;
}
  
  public static void main(String[] dosas)
  {
  
	Helmet helmet=new Helmet();
	helmet.name="NS";
	helmet.colour="black";
	helmet.brand="Bell";
	helmet.price=400.0f;

  
  Helmet helmet1=new Helmet();
	helmet1.name="pulser";
	helmet1.colour="RED";
	helmet1.brand="HJC";
	helmet1.price=500.0f;
	
	helmet.Helmets();
	helmet1.Helmets();
	
	}
}
	