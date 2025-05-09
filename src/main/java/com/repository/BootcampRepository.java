import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BootcampRepository extends JpaRepository<Bootcamp, Long> {
    List<Bootcamp> findByBootcampState(BootcampState bootcampState);
}

