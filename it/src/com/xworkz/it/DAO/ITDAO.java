package com.xworkz.it.DAO;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import com.xworkz.itentity.ITEntity;

public interface ITDAO {
	
	boolean save(ITEntity dao);
	ITEntity findById(int id);
	 default ITEntity findByName(String nameOfCompany) {
		 ITEntity itEntity=null;
		 return itEntity;
		 
	 }

}
