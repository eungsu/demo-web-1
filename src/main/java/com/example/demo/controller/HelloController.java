package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class HelloController {

	@Value("${hello.user.name}")
	private String name;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("name", name);
		return "home";
	}
}
