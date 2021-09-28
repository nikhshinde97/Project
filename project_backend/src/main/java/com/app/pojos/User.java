package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_table")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User extends BaseEntity{
	@Column(length = 30)
	private String firstName;
	
	@Column(length = 30)
	private String lastName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Address address;
	
	@Column(length = 13,name = "phone")
	private String phoneNumber;
	
	@Column(length = 30, unique = true, nullable = false)
	private String email;
	
	@Column( nullable = false)
	private String password;
	
	@Column(length = 30)
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
}
