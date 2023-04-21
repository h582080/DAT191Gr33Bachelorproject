package hvl.dat191.service;

import java.util.List;

import hvl.dat191.model.Internal;

public interface InternalService {

	List<Internal> findAll();
	
	void insertInternal(Internal internal);
	
	void updateInternal(Internal internal);
	
	void executeUpdateInternal(Internal internal);
	
	void deleteInternal(Internal internal);
}
