class MatchBoxRunner{

	public static void main(String[] alu){
	
		String brand="key";
		int noOfSticks=15;
		String colour="yallow";
		int size=2;
		float price=2.5f;
		
		
		MatchBox mbox=new MatchBox(brand,noOfSticks,colour,size,price);
		
		System.out.println(mbox.brand);
		System.out.println(mbox.noOfSticks);
		System.out.println(mbox.colour);
		System.out.println(mbox.size);
		System.out.println(mbox.price);
		
		 mbox.type=MatchType.Jumbo;
		 System.out.println(mbox.type);


	}
}