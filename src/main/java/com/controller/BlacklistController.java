import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blacklists")
public class BlacklistController {

    @Autowired
    private BlacklistService blacklistService;

    @PostMapping
    public Blacklist createBlacklist(@RequestBody CreateBlacklistRequest request) {
        return blacklistService.createBlacklist(request);
    }

    @GetMapping("/{id}")
    public Blacklist getBlacklistById(@PathVariable Long id) {
        return blacklistService.getBlacklistById(id);
    }

    @GetMapping
    public List<Blacklist> getAllBlacklists() {
        return blacklistService.getAllBlacklists();
    }

    @PutMapping("/{id}")
    public Blacklist updateBlacklist(@PathVariable Long id, @RequestBody UpdateBlacklistRequest request) {
        return blacklistService.updateBlacklist(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteBlacklist(@PathVariable Long id) {
        blacklistService.deleteBlacklist(id);
    }
}
