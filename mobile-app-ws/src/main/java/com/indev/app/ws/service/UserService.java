package com.indev.app.ws.service;

import org.springframework.stereotype.Service;

import com.indev.app.ws.ui.shared.dto.UserDto;


@Service
public interface UserService {
 UserDto createUser(UserDto userdto);
}
