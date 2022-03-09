package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @GetMapping("api/getAll")
    public List<String> getAll() {
        return List.of();
    }
}
