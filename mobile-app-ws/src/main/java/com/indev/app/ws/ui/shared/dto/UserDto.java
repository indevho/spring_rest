package com.indev.app.ws.ui.shared.dto;

import java.io.Serializable;
import java.util.List;
import lombok.Data;
@Data
public class UserDto implements Serializable {	
	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = -7282379177704534544L;
	private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean emailVerificationStatus = false;
   // private List<AddressDTO> addresses;
	
}
