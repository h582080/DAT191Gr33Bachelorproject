package hvl.dat191.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hvl.dat191.dao.ProjectdescriptionDAO;
import hvl.dat191.model.Projectdescription;

@Service
public class OpprettProsjektServiceImpl implements OpprettProsjektService {

	@Autowired
	private ProjectdescriptionDAO pdd;
	
	@Override
	public void opprettProsjekt(Projectdescription prjdsc) {
		// TODO Muligens lage objekt for prosjektbeskrivelse med placeholderverdier/modifisere databasen til å ta imot null verdier

	}

}
