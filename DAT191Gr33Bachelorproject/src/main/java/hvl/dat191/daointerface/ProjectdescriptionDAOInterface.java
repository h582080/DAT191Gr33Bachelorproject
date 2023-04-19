package hvl.dat191.daointerface;

import java.util.List;

import hvl.dat191.model.Projectdescription;

public interface ProjectdescriptionDAOInterface {
	
List<Projectdescription> findAllProjectdescription();
	
	void insertProjectdescription(Projectdescription projectDsc);
	
	void updateProjectdescription(Projectdescription projectDsc);
	
	void executeUpdateProjectdescription(Projectdescription projectDsc);
	
	public void deleteProjectdescription(Projectdescription projectDsc);

}
