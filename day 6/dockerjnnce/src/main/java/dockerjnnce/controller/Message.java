package dockerjnnce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
	
	@GetMapping(value = "/message")
	String showMessage() {
		return "hi everyone this is my docker example";
	}

}
