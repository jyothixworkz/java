package com.xworkz.teatredao;

import com.xworkz.teatreentity.TeatreEntity;

public interface TeatreDAO {

	boolean save(TeatreEntity teatreEntity);

	TeatreEntity findByid(int id);

	void updateNameAndOwnerById(String name, String owner, int id);

	void deleteById(int id);

}
