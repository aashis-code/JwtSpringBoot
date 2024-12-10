package com.springBoot.JwtAuth.Security;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class RegisterUserDto {

    private String email;
    
    private String password;
    
    private String fullName;
	
    private String about;
}
