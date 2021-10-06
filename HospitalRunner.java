class HospitalRunner{

	public static void main(String args[])
	{
	
	String name="jayadeva";
	String location="BTM Layout";
	String owner="Sri Ramesh";
	int noOfBeds="100";
	
	Hospital kiran=new Hospital(name,location,owner,noOfBeds);
	  
	 System.out.println(kiran.name);
	 System.out.println(kiran.location);
	 System.out.println(kiran.owner);
	 System.out.println(kiran.noOfBeds);

	
	}




}