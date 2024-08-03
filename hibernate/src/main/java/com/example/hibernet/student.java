package com.example.hibernet;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	// if you want to change column
//	@Column(name = "username")
	private String name;
	private String email;
	private String password;
	private String confirmpasword;
	

}
