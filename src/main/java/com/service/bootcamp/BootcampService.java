public interface BootcampService {
    Bootcamp createBootcamp(CreateBootcampRequest request);
    Bootcamp getBootcampById(Long id);
    List<Bootcamp> getAllBootcamps();
    Bootcamp updateBootcamp(Long id, UpdateBootcampRequest request);
    void deleteBootcamp(Long id);
}
