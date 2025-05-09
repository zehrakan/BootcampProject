import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Bootcamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long instructorId;
    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private BootcampState bootcampState;

    // Getters and Setters
}

public enum BootcampState {
    PREPARING,
    OPEN_FOR_APPLICATION,
    IN_PROGRESS,
    FINISHED,
    CANCELLED
}
