class NailCutter{
	
		String name;
		String loction;
		String colour;
		float price;
		NailCutterTypes nail;
		
     void nailcut(){
		
		System.out.println("invked nailcut");
		System.out.println("nailcut deatils");
		System.out.println(name);
	    System.out.println(loction);
		System.out.println(colour);
		System.out.println(price);

	}
		
		
enum NailCutterTypes{
	
	LEVER_TYPE,NIPPER,SCISSOR_CLIPPERS;
 }
	 	
	
	
	 public static void main(String[] chapatis)
	 
	 {
		NailCutter nails=new NailCutter();
		nails.name="anmul";
		nails.loction="BTM";
		nails.colour="RED";
		nails.price=3.0f;
		//nails.nail=NailCutterTypes.SCISSOR;
		
	 
	    NailCutter nails1=new NailCutter();
		nails1.name="art";
		nails1.loction="RTM";
		nails1.colour="BLACK";
		nails1.price=5.0f;
		//nails1.nail=NailCutterTypes.CLIPPERS;
		
		nails.nailcut();
		nails1.nailcut();
		
	 }

}