class ForestRunner{

	public static void main(String[] args){
	
	Forest forest=new Forest();
	
	System.out.println(forest.name);
	System.out.println(forest.location);
	System.out.println(forest.reserved);
	System.out.println(forest.state);
	System.out.println(forest.capitalcity);
	
	forest.name="KARNATAKA";
	System.out.println(forest.name);
	
	forest.state=new State();
	forest.capitalcity=new Capitalcity();
	System.out.println(forcest);
	
	String fo=forest.location;
	system.out.println(fo);
	}


}