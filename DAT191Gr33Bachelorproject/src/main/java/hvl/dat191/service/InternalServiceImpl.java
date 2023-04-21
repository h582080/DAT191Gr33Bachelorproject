package hvl.dat191.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hvl.dat191.model.Internal;
import hvl.dat191.dao.InternalDAO;

@Service
public class InternalServiceImpl implements InternalService {
	
	@Autowired
	private InternalDAO internalDao;

	@Override
	public List<Internal> findAll() {
		return internalDao.findAll();
	}

	@Override
	public void insertInternal(Internal internal) {
		internalDao.insertInternal(internal);
	}

	@Override
	public void updateInternal(Internal internal) {
		internalDao.updateInternal(internal);
	}

	@Override
	public void executeUpdateInternal(Internal internal) {
		internalDao.executeUpdateInternal(internal);
	}

	@Override
	public void deleteInternal(Internal internal) {
		internalDao.deleteInternal(internal);
	}

}
