package ecommerceapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoCode {
	
	@GetMapping(value = "/showdemo")
	String Message () {
		return "a+b=c";
	}
	

}
