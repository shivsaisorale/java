class DeveloperRunner{

public static void main(String[] idli)
{

     String name="shivsai";
	 String designation="ceo";
	 int salary=10000;
	 byte totalExp=2;
	 
  Developer kiran=new Developer(name,designation,salary,totalExp);
 
  System.out.println(kiran.name);
  System.out.println(kiran.designation);
  System.out.println(kiran.salary);
  System.out.println(kiran.totalExp);



}


}