class SaloonRunner{

	public static void main(String[] berrs)
	 {
	  Saloon saloon=new Saloon();
	  saloon.name="Green Trends";
	  saloon.location="BTM";
	  saloon.openTime=9.0f;
	  saloon.closeTime=9.0f;
	  saloon.branch=SaloonBranch.BTM;
	  
	  Saloon saloon1=new Saloon();
		saloon1.name="YLG";
	    saloon1.location="JAYANAGAR";
	    saloon1.openTime=9.0f;
	    saloon1.closeTime=8.0f;
	    saloon1.branch=SaloonBranch.JPNAGAR;
		
		saloon.haircut();
		saloon1.haircut();
		

	 }


}