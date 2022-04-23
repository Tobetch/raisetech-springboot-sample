package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.User;

@Mapper
public interface UserRepository {

	// DB処理（SELECT文）
	@Select("SELECT * FROM user")
	public List<User> findAll();

	// DB処理（DELETE文）
	@Delete("DELETE FROM user where id=#{id}")
	public void delete(int id);

}
