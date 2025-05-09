import javax.persistence.*;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long applicantId;
    private Long bootcampId;

    @Enumerated(EnumType.STRING)
    private ApplicationState applicationState;

    // Getters and Setters
}

public enum ApplicationState {
    PENDING,
    APPROVED,
    REJECTED,
    IN_REVIEW,
    CANCELLED
}
