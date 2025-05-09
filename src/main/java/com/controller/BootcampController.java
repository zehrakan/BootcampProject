import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bootcamps")
public class BootcampController {

    @Autowired
    private BootcampService bootcampService;

    @PostMapping
    public Bootcamp createBootcamp(@RequestBody CreateBootcampRequest request) {
        return bootcampService.createBootcamp(request);
    }

    @GetMapping("/{id}")
    public Bootcamp getBootcampById(@PathVariable Long id) {
        return bootcampService.getBootcampById(id);
    }

    @GetMapping
    public List<Bootcamp> getAllBootcamps() {
        return bootcampService.getAllBootcamps();
    }

    @PutMapping("/{id}")
    public Bootcamp updateBootcamp(@PathVariable Long id, @RequestBody UpdateBootcampRequest request) {
        return bootcampService.updateBootcamp(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteBootcamp(@PathVariable Long id) {
        bootcampService.deleteBootcamp(id);
    }
}
