package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TopController {

//	todo: add service by DI

	@GetMapping
	public String index() {
		return "index";
	}
}
