package Springwebex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
	
	
	@RequestMapping("/Lab")
	public String display() {
	return "index";
	}
	}
