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
@Table(name = "basket")
public class Basket {
	
	@Id
	@GeneratedValue(generator = "increment")
	@NotNull
	@Column(name = "id_basket")
	private Long id;
	
	@Column(name = "description")
	private String description;
	
	@NotNull
	@Column(name = "price")
	private int price;

}
