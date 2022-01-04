package com.torryharris.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// delete this 

@RestController
@RequestMapping("projects")
public class ProjectController {

	@GetMapping("/projects")
	public String projectList() {
		return "Dummy Project List";
	}

}
