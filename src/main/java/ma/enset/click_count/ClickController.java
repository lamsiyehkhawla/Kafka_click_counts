package ma.enset.click_count;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class ClickController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String TOPIC = "clicks";

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/click")
    public String sendClick(@RequestParam String userId) {
        kafkaTemplate.send(TOPIC, userId, "click");
        return "redirect:/";
    }
}
