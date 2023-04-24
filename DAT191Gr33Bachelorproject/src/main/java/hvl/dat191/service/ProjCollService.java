package hvl.dat191.service;

import java.util.List;

import hvl.dat191.model.Projectcollection;

public interface ProjCollService {

	List<Projectcollection> findAll();
	
	void insertProjectcollection(Projectcollection projectCl);
	
	void updateProjectcollection(Projectcollection projectCl);
	
	void executeUpdateProjectcollection(Projectcollection projectCl);
	
	public void deleteProjectcollection(Projectcollection projectCl);


}
