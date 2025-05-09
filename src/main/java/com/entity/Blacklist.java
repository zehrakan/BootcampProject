import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Blacklist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reason;
    private LocalDate date;
    private Long applicantId;

}
