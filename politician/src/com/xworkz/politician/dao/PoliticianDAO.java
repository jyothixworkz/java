package com.xworkz.politician.dao;

import java.util.Collections;
import java.util.List;

import com.xworkz.politician.dto.PoliticianDTO;

public interface PoliticianDAO {

	 boolean save(PoliticianDTO dto);

	 PoliticianDTO findByPid(int pid);

	 PoliticianDTO findByPidAndPresident(int pid, String president);

	 PoliticianDTO findByPidAndPresidentAndName(int pid, String name, String president);

	 PoliticianDTO findByPidAndName(int pid, String name);

	 String findNameByPid(int pid);

	String findPresidentByPidAndName(int pid, String name);

	int getTotal();

	PoliticianDTO findPartyNameByMaxMembers();
	default void test() {
		System.out.println("default impl of test");
	}

	default List<PoliticianDTO> findAll() {
		return Collections.EMPTY_LIST;
	}
		
      default List<String> findAllPartyName() {
		return null;
	}
      default List<Integer> findAllIds(){
		return null;
    	  
      }
      default List<Object> findAllNoOfMembersAndTotalBudgetAndPartyName(){
		return null;
    	  
      }

	


}
