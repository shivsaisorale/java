class IcecreamStarter{
	
	public static void main(String[] ragi)
	{

	
	IceCream cream=new IceCream(-20,"Tender",Colour.YELLOW);

		System.out.println(cream.temp);
		System.out.println(cream.flavour);
		System.out.println(cream.color);
		System.out.println(cream.brand);
		System.out.println(cream.type);
		cream.type="Cone";
		cream.brand=new Brand();
		System.out.println(cream.brand);
		System.out.println(cream);
		
		String fla=cream.flavour;
		System.out.println(fla);
		
		float temp=cream.temp;
		Brand brand=cream.brand;
		String name=brand.name;
		String location=brand.location;
		String oname=brand.ownerName;
		int since=brand.since;
		System.out.println(name);
		System.out.println(location);
		System.out.println(oname);
		System.out.println(since);
		brand.name="Naturals";
		brand.ownerName="kiran";
		brand.since=1333;
		
		System.out.println(name);
		System.out.println(location);
		System.out.println(oname);
		System.out.println(since);
		cream.brand.name=null;
		System.out.println(brand.name);
		cream.brand=null;
		
		System.out.println(brand.location);
		}
	
}