package com.indev.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Entity(name="users") //name of table , 
@Data
public class UserEntity implements Serializable{

	/**
	 * geneed UID
	 */
	private static final long serialVersionUID = -3208429611752395474L;
	
	@Id
	@GeneratedValue  
	private long id;//generation strategies for thevalues of primary keys
	
	@Column(nullable= false)
    private String userId;// 유저 고유 id 
	
	@Column(nullable= false , length =  50)
    private String firstName;
	@Column(nullable= false , length =  50)
	private String lastName;
	
	@Column(nullable= false , length =  120)
    private String email;
	@Column(nullable= false)
    private String encryptedPassword;// encryption 제약.
    
	
	private String emailVerificationToken;
    
	@Column(nullable= false , columnDefinition = "boolean default false")
	private Boolean emailVerificationStatus = false;
	
	
	
	
	
	
	
}
