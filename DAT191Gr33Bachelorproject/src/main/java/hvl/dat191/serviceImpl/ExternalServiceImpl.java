package hvl.dat191.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hvl.dat191.dao.ExternalDAO;
import hvl.dat191.model.External;
import hvl.dat191.service.ExternalService;

@Service
public class ExternalServiceImpl implements ExternalService{
	
	@Autowired
	private ExternalDAO externalDao;

	@Override
	public List<External> findAll() {
		return externalDao.findAll();
	}

	@Override
	public void insertExternal(External External) {
		externalDao.insertExternal(External);
	}

	@Override
	public void updateExternal(External External) {
		externalDao.updateExternal(External);
	}

	@Override
	public void executeUpdateExternal(External External) {
		externalDao.executeUpdateExternal(External);
	}

	@Override
	public void deleteExternal(External External) {
		externalDao.deleteExternal(External);
	}


}
