package hvl.dat191.daointerface;

import java.util.List;

import hvl.dat191.model.Projectdescription;

public interface ProjectdescriptionDAOInterface {
	
List<Projectdescription> findAll();
	
	void insertProjectdescription(Projectdescription projectDsc);
	
	void updateProjectdescription(Projectdescription projectDsc);
	
	void executeUpdateProejctdescription(Projectdescription projectDsc);
	
	public void deleteProejectdescription(Projectdescription projectDsc);

}
