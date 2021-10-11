class MIPhoneRunner{

	public static void main(String[] args){
	
	MIPhone phone=new MIPhone();
	
	phone.setBrand("Redmi note10");
	System.out.println(phone.brand);
	
	phone.setPrice(10000.0f);
	System.out.println(phone.price);
	
	phone.setColor("red");
	System.out.println(phone.color);
	
	phone.setImei(128);
	System.out.println(phone.imei);
	
	PhonePay phone1=new PhonePay();
	
	phone1.setCompany("Privet company");
	System.out.println(phone1.company);
	
	phone1.setVersion("13.4");
	System.out.println(phone1.version);
	
	
	phone1.setWorking("good");
	System.out.println(phone1.working);

	}
}