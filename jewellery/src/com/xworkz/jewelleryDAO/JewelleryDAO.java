package com.xworkz.jewelleryDAO;

import com.xworkz.jewelleryentity.JewelleryEntity;

public interface JewelleryDAO {

	boolean save(JewelleryEntity jewelleryEntity);
	JewelleryEntity findByid(int id);
	void updateNameAndLocationById(String name, String location , int id);
	void deleteById(int id);
	

}
