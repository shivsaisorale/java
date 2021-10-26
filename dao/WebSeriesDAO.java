package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDAO[] dto=new WebSeriesDAO[3];
	private int temp=0;
	
	public void webSeriesNames(WebSeriesDAO dto) {
		if(temp   < this.dto.length && dto !=null) {
			this.dto[this.temp++]=dto;
			System.out.println("create method invoked:".concat(String.valueOf(dto)));
		}else {	
			System.out.println("creat method invalid");
		}
} 


	public void delet(int index) {
		if(index <dto.length && index >=0) {
			this.dto[index]=null;
			System.out.println("delete method invoked :".concat(String.valueOf(index)));
		}else {
			System.out.println("delet method invaluis:");
		}
		}

	public void updated(int index,WebSeriesDAO name) {
		if(index < dto.length && index >= 0 && name != null) {
			this.dto[index]=name;
System.out.println("updated method invoked:".concat(String.valueOf(index)).concat(null));
		}else {
			System.err.println("update method invalid");
			
		}
	}
public WebSeriesDAO[] getDto() {
	return dto;
	}
}