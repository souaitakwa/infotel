package com.example.infoTelEvaluation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class InfoTel {

	
	@GetMapping
	public String getHelloWorld() {
		return "hello world";
	}
	
	
	@PostMapping(path="/{param}")
	public String postParam(@PathVariable("param") String param) {
		return  param;
	}
}
