package com.indev.app.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indev.app.ws.UserRepository;
import com.indev.app.ws.io.entity.UserEntity;
import com.indev.app.ws.service.UserService;
import com.indev.app.ws.ui.shared.dto.UserDto;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired  // 오토와이어 강제로 받아서 합성 기법을 사용한다. 이제 userRepository 활용에 들어가본다. 
	UserRepository userRepository;
	
	
	@Override
	public UserDto createUser(UserDto user) {
		
		
		// insert 로직 
		UserEntity userEntity =  new UserEntity();
		//beanutil -- 카피뜨기. 
		BeanUtils.copyProperties(user, userEntity);// copy user > userEntity.
		// UserEntity.java 보여주면서 설명함. 
		
		UserEntity storedUserDetails = userRepository.save(userEntity);	
//Saves a given entity. Use the returned instance for further operations as the save operation might have changed theentity instance completely.		
		
		userEntity.setEncryptedPassword("test");
		//alpha neumeric.. 
		userEntity.setUserId("testUserId");
		
		
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		// not nullable 인 애들이 있음 그걸 고려한다.
		
		
		
		
		return user;
	}

}
