class CurtainRunner{

	public static void main(String[] values){
	
	Curtain curtain=new Curtain();
	String name=curtain.getName();
	System.out.println("curtain is cool"+name);
	
	String color=curtain.getColor();
	System.out.println("curtain is red"+color);
	
	curtain.setPrice(12.0f);
	System.out.println(curtain.price);
	
	curtain.setDesign("round"); 
	System.out.println(curtain.design);
	
	curtain.setPrice(50);
	System.out.println(curtain.price);
	
	
	
	}

}