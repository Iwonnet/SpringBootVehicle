package it.stacja.app.web.api.domain;

import it.stacja.app.web.api.domain.repository.ConfigRepository;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/config")
public class ConfigController {

    private ConfigRepository configRepository;

    public ConfigController(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    @PutMapping("/{name}")
    public String save(@PathVariable("name") String name,
                       @RequestBody String body){
        Config config = new Config();
        config.setName(name);
        config.setConfig(body);
        configRepository.save(config);
        return "";
    }
}
