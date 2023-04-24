package hvl.dat191.service;

import java.util.List;

import hvl.dat191.model.Subjectmanager;

public interface SubjectManagerService {

	List<Subjectmanager> findAllSubjectmanager();
	
	void insertSubjectmanager(Subjectmanager subjectmanager);
	
	void updateSubjectmanager(Subjectmanager subjectmanager);
	
	void executeUpdateSubjectmanager(Subjectmanager subjectmanager);
	
	public void deleteSubjectmanager(Subjectmanager subjectmanager);

}
