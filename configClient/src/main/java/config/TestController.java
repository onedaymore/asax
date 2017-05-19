package config;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;
	
    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
}