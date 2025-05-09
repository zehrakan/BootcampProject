import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BootcampServiceImpl implements BootcampService {

    @Autowired
    private BootcampRepository bootcampRepository;
    @Autowired
    private BootcampMapper bootcampMapper;

    @Override
    public Bootcamp createBootcamp(CreateBootcampRequest request) {
        Bootcamp bootcamp = bootcampMapper.createBootcampRequestToBootcamp(request);
        return bootcampRepository.save(bootcamp);
    }

    @Override
    public Bootcamp getBootcampById(Long id) {
        return bootcampRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bootcamp> getAllBootcamps() {
        return bootcampRepository.findAll();
    }

    @Override
    public Bootcamp updateBootcamp(Long id, UpdateBootcampRequest request) {
        Bootcamp bootcamp = bootcampRepository.findById(id).orElse(null);
        if (bootcamp != null) {
            bootcamp.setBootcampState(request.getBootcampState());
            return bootcampRepository.save(bootcamp);
        }
        return null;
    }

    @Override
    public void deleteBootcamp(Long id) {
        bootcampRepository.deleteById(id);
    }
}
