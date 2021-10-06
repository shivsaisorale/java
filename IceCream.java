class IceCream{

	String flavour="Vanilla";
	Colour color=Colour.BLACK;
	float temp;
	String type;
	Brand brand;
	
	IceCream(float temp)
	{
		this.temp=temp;
	}
	IceCream(float temp,String flavour,Colour color)
	{
		this(temp);
		this.flavour=flavour;
		this.color=color;
	}
}
