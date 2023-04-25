package hvl.dat191.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hvl.dat191.dao.ProjectdescriptionDAO;
import hvl.dat191.model.Projectdescription;

@Service
public class OpprettOppdragsgiverServiceImpl implements OpprettOppdragsgiverService {

	@Autowired
	private ProjectdescriptionDAO pdd;
	
	@Override
	public void opprettOppdragsgiver(Projectdescription prjdsc) {
		// TODO legge inn resterende verdier for prosjekt

	}

}
