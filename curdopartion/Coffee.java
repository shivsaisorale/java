package com.xworkz.shop.curdopartion;

public class Coffee {

	
	private static final String CoffeeType = null;
	private String coldcoffee;
	private String[] coffeeNames=new String[7];
	private int tea=0;
	private String coffeeType;
	
	public Coffee() {
		this("coffeecold");
		
	}
	
	public Coffee(String string) {
		// TODO Auto-generated constructor stub
	}

	public void Coffee(String coffeeType) {
		this.coffeeType=coffeeType;
		
	}
    public String getCoffeeType() {
    	return CoffeeType;
    }
public void addcoffeeNames(String name) {
	if(this.tea<this.coffeeNames.length) {
		this.coffeeNames[this.tea]=name;
		this.tea++;
		System.out.println("invoked the add Method,ver added:".concat(name));
		
	}else {
		System.err.println("Error the array is full cant add");
	}
}
	public String getcoffeeNames() {
		return this.coffeeNames;
	}
public void delete(int no) {
	if(no >= 0 && no < coffeeNames.length) {
		this.coffeeNames[no] =null;
		System.err.println("Error :cant be deleted");
		
	}
}

}
