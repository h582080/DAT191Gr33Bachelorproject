package hvl.dat191.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import hvl.dat191.model.Projectcollection;
import hvl.dat191.service.ProjCollService;
import hvl.dat191.dao.ProjectcollectionDAO;

@Service
public class ProjCollServiceImpl implements ProjCollService {

	@Autowired
	private ProjectcollectionDAO pcd;
	
	@Override
	public List<Projectcollection> findAll() {
		return pcd.findAll();
	}

	@Override
	public void insertProjectcollection(Projectcollection projectCl) {
		pcd.insertProjectcollection(projectCl);
	}

	@Override
	public void updateProjectcollection(Projectcollection projectCl) {
		pcd.updateProjectcollection(projectCl);
	}

	@Override
	public void executeUpdateProjectcollection(Projectcollection projectCl) {
		pcd.executeUpdateProjectcollection(projectCl);
	}

	@Override
	public void deleteProjectcollection(Projectcollection projectCl) {
		pcd.deleteProjectcollection(projectCl);
	}

}
