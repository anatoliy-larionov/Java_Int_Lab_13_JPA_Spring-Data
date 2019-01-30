package com.epam.project.dto.enums;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data 
@Entity
@AllArgsConstructor
@Table(name = "roles")
public enum Role {
	
	ADMIN, USER;
	
	@Id 
	@GeneratedValue(generator = "increment")
	@NotNull
	@Column(name = "id_role")
	private Long id;
	
	@Column(name = "name_role")
	@NotNull
	private String nameRole;
	
	private Role() {
	}
}
