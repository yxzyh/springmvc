package com.fis.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("say")
	public String sayHello(){
		System.out.println("hi");
		return "success";
	}
}
