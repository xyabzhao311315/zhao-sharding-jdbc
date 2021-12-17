package com.zhao.sian.sharding.controller;

import java.util.Random;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhao.sian.sharding.domain.UserModel;
import com.zhao.sian.sharding.mapper.UserMapper;

@RestController
public class TestController {

	@Resource
	UserMapper userMapper;

	@GetMapping("/add")
	public Object add() {

		UserModel model = new UserModel();
		model.setName("test");
		model.setAge(new Random().nextInt( 100 ) + 1);
		userMapper.insert(model);
		return "ok";
	}

	@GetMapping("/list")
	public Object list() {

		return userMapper.selectAll();
	}

	@GetMapping("/like")
	public Object like() {

		return userMapper.selectLike("%2%");
	}

	@GetMapping("/page")
	public Object page() {

		return userMapper.selectLikePage("%2%");
	}

}