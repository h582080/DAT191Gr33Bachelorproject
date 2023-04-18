package hvl.dat191.daointerface;

import java.util.List;

import hvl.dat191.model.Projectcollection;

public interface ProjectcollectionDAOInterface {
	
List<Projectcollection> findAll();
	
	void insertProjectcollection(Projectcollection projectCl);
	
	void updateProjectcollection(Projectcollection projectCl);
	
	void executeUpdateProjectcollection(Projectcollection projectCl);
	
	public void deleteProjectcollection(Projectcollection projectCl);

}
