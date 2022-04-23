package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@RestController
public class UserRestApiController {

	@Autowired
	UserService userService;

	@GetMapping("/api")
	public List<User> getUsers() {
		// ユーザー情報取得
		List<User> userList = userService.getUsers();
		return userList;
	}

}
