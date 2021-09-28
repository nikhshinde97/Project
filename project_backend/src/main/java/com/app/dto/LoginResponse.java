package com.app.dto;

import com.app.pojos.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class LoginResponse {

	private Integer userId;
	private String firstName;
	private String email;
	private Role role;
}
