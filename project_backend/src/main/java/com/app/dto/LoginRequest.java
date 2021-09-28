package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@ToString
public class LoginRequest {
	private String email;
	private String password;
}
