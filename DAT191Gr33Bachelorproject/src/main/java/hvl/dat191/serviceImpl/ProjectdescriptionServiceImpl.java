package hvl.dat191.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hvl.dat191.dao.ProjectdescriptionDAO;
import hvl.dat191.model.Projectdescription;
import hvl.dat191.service.ProjectdescriptionService;

@Service
public class ProjectdescriptionServiceImpl implements ProjectdescriptionService {

	@Autowired
	private ProjectdescriptionDAO pdd;
	
	@Override
	public List<Projectdescription> findAllProjectdescription() {
		return pdd.findAllProjectdescription();
	}

	@Override
	public void insertProjectdescription(Projectdescription projectDsc) {
		pdd.insertProjectdescription(projectDsc);
	}

	@Override
	public void updateProjectdescription(Projectdescription projectDsc) {
		pdd.updateProjectdescription(projectDsc);
	}

	@Override
	public void executeUpdateProjectdescription(Projectdescription projectDsc) {
		pdd.executeUpdateProjectdescription(projectDsc);
	}

	@Override
	public void deleteProjectdescription(Projectdescription projectDsc) {
		pdd.deleteProjectdescription(projectDsc);
	}

}
