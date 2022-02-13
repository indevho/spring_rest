package com.indev.app.ws.ui.model.response;

import lombok.Data;

@Data
public class UserRest {
	private String userId;  // unique key  - incremented 
	private String firstName;
	private String lastName;
	private String email;
	
}
