package com.epam.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
	@Id
	@NotNull
	@GeneratedValue(generator = "increment")
	@Column(name = "id_user")
	private Long id;
	
	@NotNull
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull
	@Column(name = "login")
	private String login;
	
	@NotNull
	@Column(name = "password")
	private String password;
	
}
