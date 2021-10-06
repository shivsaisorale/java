class BagRunner{

	public static void main(String []args){
	
	String name="tata";
	String colour="red";
	String cloath="cartune";
	float price=200.0f;
	Boolean Bagturist=true;
	
	Bag bag1=new Bag(name,colour,cloath);
	
    System.out.println(bag1.price);
	System.out.println(bag1.name);
	System.out.println(bag1.colour); 
	System.out.println(bag1.cloath);
	System.out.println(bag1.Bagturist);
	}
	
	
}