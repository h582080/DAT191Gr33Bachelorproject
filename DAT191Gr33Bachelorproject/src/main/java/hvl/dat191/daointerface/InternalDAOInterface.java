package hvl.dat191.daointerface;

import java.util.List;

import hvl.dat191.model.Internal;

public interface InternalDAOInterface {
	
List<Internal> findAll();
	
	void insertInternal(Internal internal);
	
	void updateInternal(Internal internal);
	
	void executeUpdateInternal(Internal internal);
	
	public void deleteInternal(Internal internal);

}
