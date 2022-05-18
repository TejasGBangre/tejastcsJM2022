package ecommerceapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetAll {
	
	@GetMapping(value = "/greeting")
	
	String Message() {
		return "hi all how is your training going on?";
	}

}
