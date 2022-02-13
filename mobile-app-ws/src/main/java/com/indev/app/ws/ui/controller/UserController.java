package com.indev.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indev.app.ws.service.UserService;
import com.indev.app.ws.service.impl.UserServiceImpl;
import com.indev.app.ws.ui.model.request.UserDetailRequestModel;
import com.indev.app.ws.ui.model.response.UserRest;
import com.indev.app.ws.ui.shared.dto.UserDto;

@RestController
@RequestMapping("users") // to   >  http://localhost:8080/users
public class UserController {
	
//	 DEFINE PROPERTY 
	@Autowired
	UserServiceImpl userService;

	@GetMapping
	public String getUser(String username , String userid) {
		
		return "getUser called :  "+ username;
	}
	
	@PostMapping
	public String createUser(@RequestBody UserDetailRequestModel userDetails) {
		UserRest returnValue =  new UserRest();
		UserDto userDto = new UserDto();
		System.out.println(userDto);// before
		BeanUtils.copyProperties(userDetails, userDto);
		System.out.println(userDto);//after
		
		UserDto createdUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		
		
		return userDetails.toString();
	}
	
	@PutMapping
	public String updateUser() {
		return "updateUser called";
	}
	
		
	@DeleteMapping
	public String deleteUser() {
		return "deleteUser called";
	}
	
	
}
