package com.springBoot.JwtAuth.Security;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class LoginUserDto {

    private String email;
    
    private String password;
}
