import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;
    @Autowired
    private ApplicationMapper applicationMapper;

    @Override
    public Application createApplication(CreateApplicationRequest request) {
        Application application = applicationMapper.createApplicationRequestToApplication(request);
        return applicationRepository.save(application);
    }

    @Override
    public Application getApplicationById(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    @Override
    public Application updateApplication(Long id, UpdateApplicationRequest request) {
        Application application = applicationRepository.findById(id).orElse(null);
        if (application != null) {
            application.setApplicationState(request.getApplicationState());
            return applicationRepository.save(application);
        }
        return null;
    }

    @Override
    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }
}
