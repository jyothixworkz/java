package com.xworkz.politician.dao;

import com.xworkz.politician.dto.PoliticianDTO;

public interface PoliticianDAO {
	
	 public boolean save(PoliticianDTO dto);
	public PoliticianDTO findByPid(int pid);
	 public PoliticianDTO findByPidAndPresident(int pid,String president);
     public PoliticianDTO findByPidAndPresidentAndName(int pid,String name, String president);
     public PoliticianDTO findByPidAndName(int pid,String name);
     public String findNameByPid(int pid);
     public String findPresidentByPidAndName(int pid, String name);
     public int getTotal();
     public PoliticianDTO findPartyNameByMaxMembers();
				
				
					
					
				
	
	
	
	
	

}
