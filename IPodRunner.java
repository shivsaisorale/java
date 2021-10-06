class IPodRunner{

	public static void main(String[] alu){
	
	IPod ipod=new IPod();
	ipod.name="moto";
	ipod.colour="black";
	ipod.Brand="apple";
	ipod.price=100.0f;
	ipod.types=IPodTypes.IPODMINI;
	
	
	IPod ipod1=new IPod();
	ipod1.name="poco";
	ipod1.colour="red";
	ipod1.Brand="apple";
	ipod1.price=200.0f;
	ipod1.types=IPodTypes.IPODNANO;
	

	
	ipod.Apple();
	ipod1.Apple();
	}
}