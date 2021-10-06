class Event{
public static void main(String args[]){
CountryMember("Gomu",23,true);

}
static void CountryMember(String name,int reg_no,boolean f_report){
String p_Name=name;
int id=reg_no;
boolean report=f_report;
System.out.println("name of person:"+p_Name);
System.out.println("person id:"+id);
System.out.println("entry :"+report);
}

}