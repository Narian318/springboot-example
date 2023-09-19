package com.integrationninjas.springbootexample.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public Object hello() {
		Map<String, String> object = new HashMap<>();
		object.put("name", "Narendra N");
		object.put("email", "coolnarian@gmail.com");
		object.put("website", "http://www.cv.naren-cloudsolutions.click");
		return object;
	}

}
