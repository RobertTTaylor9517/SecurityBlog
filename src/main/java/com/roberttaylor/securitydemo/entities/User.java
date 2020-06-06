package com.roberttaylor.securitydemo.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	
	@Id
	@GeneratedValue(generator = "UUID",
	strategy = GenerationType.AUTO)
	@GenericGenerator(name = "id", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	@NotNull
	private String name;
	
	

	public User() {
	
	}

	public User(UUID id, String username, String password, String name) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
