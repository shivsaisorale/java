package com.xworkz.busdriver;

import com.xworkz.bus.ArrayBankDAO;
import com.xworkz.bus.BankAssociation;
import com.xworkz.bus.BankDAO;
import com.xworkz.bus.BankDTO;

public class BankScammer {

	public static void main(String[] args) {

	BankDTO bank=new BankDTO("T11", "SBI", 12223f,"Bidar");
	BankDTO bank1=new BankDTO("T11", "SBI", 12223f,"Bidar");
	BankDTO bank2=new BankDTO("T11", "SBI", 12223f,"Bidar");
	BankDTO bank3=new BankDTO("T11", "SBI", 12223f,"Bidar");

	}
	BankDAO bankdao=new ArrayBankDAO();
	
	BankAssociation bankAssociation=new BankAssociation(bankdao);
	bankAssociation.deletdeatils(bank);
	
	bankassocition.deleteAtIntex(2);
	
	
	bankassocition.updateDetails(2,bank3);
	
	
}
	}
}
