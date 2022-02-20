package com.indev.app.ws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.indev.app.ws.io.entity.UserEntity;
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
// 1  어떤 generic 들어가는가?  persist 가 될 generic 들어가면 된다. 즉 T 에는 UserEntity , ID에는 이 엔티티의 깃값이 있어야한다.

// 2  여기서 끝나면. 스프링에 달라붙지 못하므로,  이 인터페이스에  @Repository 를 붙여 주어야 한다. 

	//UserEntity findUserByEmail(String email); // 추상메서드 하나 선언 해주고 끗. 
	
	// 을 하려다가. 그냥 이 인터페이스 를 상속한 서비스 하나만 만들어본다. -- 추상 메서드 주석 처리 
	
	
	
}
