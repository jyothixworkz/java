package ITEntityRunner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.it.DAO.ITDAO;
import com.xworkz.it.DAO.ITDAOImpl;
import com.xworkz.itentity.ITEntity;

public class ITEntityRunner {
	public static void main(String[] args) {
		ITEntity itEntity = new ITEntity(1, "deduce", 70000, "latha", "manoj", "nandan", LocalDate.now(),
				LocalDate.now(), LocalTime.of(9, 0), LocalTime.of(7, 0));
		ITEntity itEntity1 = new ITEntity(2, "tcs", 75000, "darshan", "chanda", "tata", LocalDate.now(),
				LocalDate.now(), LocalTime.of(9, 0), LocalTime.of(7, 0));
		ITEntity itEntity2 = new ITEntity(3, "infosys", 7000, "shashidhar", "sathish", "narayana", LocalDate.now(),
				LocalDate.now(), LocalTime.of(9, 0), LocalTime.of(7, 0));
		ITEntity itEntity3 = new ITEntity(4, "capgemini", 700, "sandesh", "sowmya", "sachin", LocalDate.now(),
				LocalDate.now(), LocalTime.of(9, 0), LocalTime.of(7, 0));
		ITEntity itEntity4 = new ITEntity(5, "xworkz", 7, "om", "asha", "vinay", LocalDate.now(), LocalDate.now(),
				LocalTime.of(9, 0), LocalTime.of(7, 0));
		ITDAO itdao = new ITDAOImpl();
		/*
		 * itdao.save(itEntity); itdao.save(itEntity1); itdao.save(itEntity2);
		 * itdao.save(itEntity3); itdao.save(itEntity4);
		 */
		// ITEntity save =itdao.findById(1);
		//System.out.println(save);
		ITEntity details = itdao.findByName("deduce");
		System.out.println(details);

	}

}
