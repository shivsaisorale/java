class CurrencyRunner{

	public static void main(String[] args){
	
	Currency ref=new Currency();
	ref.name="doller";
	ref.value=1;
	ref.country=new Country1();
	ref.country.name="USA";
	ref.country.code=1;
	ref.displayDetails();
	ref.country.displayDetails();
	
	
	}
}