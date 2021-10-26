package com.xworkz.dp;


import com.xworkz.dp.dto.TempleDTO;
import com.xworkz.dp.dto.TempleDAO;

public class TempleStarter {

	public static void main(String[] args) {
		TempleDTO templeDTO1 =new TempleDTO("red","23","M",100.0f,true);
		TempleDTO templeDTO2 =new TempleDTO("black","34","XL",300.0f,true);
		TempleDTO templeDTO3 =new TempleDTO("blue","32","XL",200.0f,false);
		TempleDTO templeDTO4 =new TempleDTO("yellow","34","XL",300.0f,true);
		TempleDTO templeDTO5 =new TempleDTO("black","34","XL",300.0f,true);
		TempleDTO templeDTO6 =new TempleDTO("green","34","XL",300.0f,true);
	    
		TempleDAO templeDAO=new TempleDAO();
		templeDAO.save(templeDTO1);
		templeDAO.save(templeDTO1);
		templeDAO.save(templeDTO1);
		templeDAO.save(templeDTO1);
		templeDAO.save(templeDTO1);
		templeDAO.save(templeDTO1);
	   
		TempleDTO[] templeArray = TempleDAO.getTempleDTO();
	    {

	for(int no =0; no < templeArray.length;no++) {
		TempleDTO ref = templeArray[no];
		 if (ref!=null) {
			 System.out.println("temple colour : "+ref.getColour());
			 System.out.println("temple name"+ref.getName());
			 System.out.println("location: " +ref.getLocation());
			 System.out.println("yest gante: " +ref.getYestGante());
			 System.out.println("prasada"+ref.isPrasada());
			 System.out.println("----------------");
			 
		 }
	}
}
	}
}




