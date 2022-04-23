package com.example.demo.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping("/api/delete/{id}")
	public void deleteUser(@PathVariable String id) {
		// ユーザー情報削除
		if (Objects.equals(id, null)) {
			System.err.println("削除したいユーザーのidを入力してください");
			return;
		}
		userService.deleteUser(Integer.parseInt(id));
		System.out.println("ユーザー削除完了！削除ユーザーID: " + id);
	}

}
