class SamosaRunner{

	public static void main(String[] dosa) 
	{
	float cost=20.0f;
	boolean good=true;
	Samosa samosa=new Samosa(cost,good);
	System.out.println(samosa.cost);
	System.out.println(samosa.taste);
	System.out.println(samosa.size);
	System.out.println(samosa.intgredients);
	
	String[] inc={"Potato","onion","chilli","Coriander","Salt","oil","Maida Flour"};
	
	Samosa samosa1=new Samosa(15.of,false,SamosaSize,SMALL,inc);
	System.out.println(samosa1.cost);
	System.out.println(samosa1.taste);
	System.out.println(samosa1.size);
	System.out.println(samosa1.ingredients);
	
	
	}

}