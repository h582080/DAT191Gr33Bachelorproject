package hvl.dat191.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hvl.dat191.dao.SubjectmanagerDAO;
import hvl.dat191.model.Subjectmanager;
import hvl.dat191.service.SubjectManagerService;

@Service
public class SubjectManagerServiceImpl implements SubjectManagerService {

	@Autowired
	private SubjectmanagerDAO smd;
	
	@Override
	public List<Subjectmanager> findAllSubjectmanager() {
		return smd.findAllSubjectmanager();
	}

	@Override
	public void insertSubjectmanager(Subjectmanager subjectmanager) {
		smd.insertSubjectmanager(subjectmanager);
	}

	@Override
	public void updateSubjectmanager(Subjectmanager subjectmanager) {
		smd.updateSubjectmanager(subjectmanager);
	}

	@Override
	public void executeUpdateSubjectmanager(Subjectmanager subjectmanager) {
		smd.executeUpdateSubjectmanager(subjectmanager);
	}

	@Override
	public void deleteSubjectmanager(Subjectmanager subjectmanager) {
		smd.deleteSubjectmanager(subjectmanager);
	}

}
