public interface ApplicationService {
    Application createApplication(CreateApplicationRequest request);
    Application getApplicationById(Long id);
    List<Application> getAllApplications();
    Application updateApplication(Long id, UpdateApplicationRequest request);
    void deleteApplication(Long id);
}
