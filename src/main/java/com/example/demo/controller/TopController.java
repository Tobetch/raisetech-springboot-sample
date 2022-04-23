package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Controller
public class TopController {

//	todo: add service by DI
	@Autowired
	UserService userService;

	@GetMapping
	public String index(Model m) {

		m.addAttribute("message", "wasshoi");

		// ユーザー情報取得
		List<User> userList = userService.getUsers();
		System.out.println(userList);
		m.addAttribute(userList);

		return "index";
	}
}
