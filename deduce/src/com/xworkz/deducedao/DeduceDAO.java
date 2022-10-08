package com.xworkz.deducedao;

import com.xworkz.deduceentity.DeduceEntity;

public interface DeduceDAO {
	boolean save(DeduceEntity deduceEntity);
	DeduceEntity findByid(int id);
	void updateNameAndOwnerById(String name, String owner , int id);
	void deleteById(int id);

}
