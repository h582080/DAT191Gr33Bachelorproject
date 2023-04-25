package hvl.dat191.serviceTests;

import java.util.List;

import hvl.dat191.model.External;

public interface ExternalService {
	
	List<External> findAll();
	
	void insertExternal(External external);
	
	void updateExternal(External external);
	
	void executeUpdateExternal(External external);
	
	public void deleteExternal(External external);

}
