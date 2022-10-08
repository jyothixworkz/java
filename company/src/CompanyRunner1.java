import com.xworkz.company.DAO.ComapanyDAOImp;
import com.xworkz.company.DAO.CompanyDAO;
import com.xworkz.company.DTA.CompanyDTO;

public class CompanyRunner1 {

	public static void main(String[] args) {

		CompanyDTO companyDTO=new CompanyDTO(1, "manoj", 20000.00,"m");
		
		CompanyDTO companyDTO1=new CompanyDTO(2, "sandesg", 202000.00,"d");
		
		CompanyDTO companyDTO2=new CompanyDTO(3, "manya", 2000540.00,"s");
		
		CompanyDTO companyDTO3=new CompanyDTO(4, "sowmya", 200200.00,"c");
		
		CompanyDTO companyDTO4=new CompanyDTO(5, "sathya", 200700.00,"n");
		
		CompanyDTO companyDTO5=new CompanyDTO(6, "sangeetha", 200500.00,"x");
		
		CompanyDTO companyDTO6=new CompanyDTO(7, "latha", 200050.00,"z");
		
		CompanyDTO companyDTO7=new CompanyDTO(8, "preeti", 200500.00,"a");
		
		CompanyDTO companyDTO8=new CompanyDTO(9, "parinitha", 205000.00,"m");
		
		CompanyDTO companyDTO9=new CompanyDTO(10, "mallu", 200040.00,"c");
		
		CompanyDTO companyDTO10=new CompanyDTO(11, "abhi", 203000.00,"v");
		
		CompanyDTO companyDTO11=new CompanyDTO(12, "arjun", 200500.00,"m");
		
		CompanyDTO companyDTO12=new CompanyDTO(13, "hanu", 200050.00,"g");
		
		CompanyDTO companyDTO13=new CompanyDTO(14, "sarya", 200500.00,"h");
		
		CompanyDTO companyDTO14=new CompanyDTO(15, "omkar", 202000.00,"c");
		
		CompanyDTO companyDTO15=new CompanyDTO(16, "saty", 200030.00,"l");
		
		CompanyDTO companyDTO16=new CompanyDTO(17, "ragu", 20080.00,"n");
		
		CompanyDTO companyDTO17=new CompanyDTO(18, "meena", 20700.00,"m");
		
		CompanyDTO companyDTO18=new CompanyDTO(19, "malakmi", 28000.00,"g");
		
		CompanyDTO companyDTO19=new CompanyDTO(20, "mona", 20200.00,"l");
		
		
		
		CompanyDAO companyDAO=new ComapanyDAOImp();
		
		companyDAO.sava(companyDTO19);
		companyDAO.sava(companyDTO18);
		companyDAO.sava(companyDTO17);
		companyDAO.sava(companyDTO16);
		companyDAO.sava(companyDTO15);
		companyDAO.sava(companyDTO14);
		companyDAO.sava(companyDTO13);
		companyDAO.sava(companyDTO12);
		companyDAO.sava(companyDTO11);
		companyDAO.sava(companyDTO10);
		companyDAO.sava(companyDTO9);
		companyDAO.sava(companyDTO8);
		companyDAO.sava(companyDTO7);
		companyDAO.sava(companyDTO6);
		companyDAO.sava(companyDTO5);
		companyDAO.sava(companyDTO4);
		companyDAO.sava(companyDTO3);
		companyDAO.sava(companyDTO2);
		companyDAO.sava(companyDTO1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
