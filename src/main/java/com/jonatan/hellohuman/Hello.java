package com.jonatan.hellohuman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {
	
	@GetMapping("")
	public String index(@RequestParam(value="name",required=false) String name, @RequestParam(value="lastname",required=false) String lastname) {
		String result;
		if(name == null) {
			result = "<h1>Hello Human!</h1>";
		} else {
			result = "<h1>Hello " + name;
			if (lastname != null) {
				result += " " + lastname + "!</h1>";
			} else {
				result += "!</h1>";
			}
		}
		result += "<p>Welcome to SpringBoot!";
		System.out.println("This is the value returned: " + result);
		return result;
	}
}
