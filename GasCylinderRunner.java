class GasCylinderRunner{

	public static void main(String[] args)
	{
	
 	String colour="red";
	int price=900;
	float weight=16;
	int cylinderNo=23234;
	
	
	GasCylinder Gas=new GasCylinder(colour,price,weight,cylinderNo);
	
	System.out.println(Gas.colour);
	System.out.println(Gas.price);
	System.out.println(Gas.weight);
	System.out.println(Gas.cylinderNo);
	

	Gas.type=GasType.HP;
	System.out.println(Gas.type);
	Gas.size=GasSize.LONG;
	System.out.println(Gas.size);
	
	
	}


}