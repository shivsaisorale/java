class LaboratoryRunner{

	public static void main(String[] args)
	{
	
	String loction="2nd stega";
	String name="CS";
	int noOfRooms=2;
	String[] opertorNames={"sangu","sagar","kiran","sai","abhi"};
	
	
	Laboratory lab=new Laboratory(loction,name,noOfRooms,opertorNames);
	
	System.out.println(lab.loction);
	System.out.println(lab.name);
    System.out.println(lab.noOfRooms);
	System.out.println(lab.opertorNames[0]);
	System.out.println(lab.opertorNames[1]);
	System.out.println(lab.opertorNames[2]);
	System.out.println(lab.opertorNames[3]);
	System.out.println(lab.opertorNames[4]);
	 lab.type=LabType.CSE;
	System.out.println(lab.type);
    
	}



}