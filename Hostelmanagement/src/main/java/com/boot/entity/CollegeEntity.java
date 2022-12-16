package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="college_t")

public class CollegeEntity {
	
	
	 @Id
 	@GeneratedValue(strategy=GenerationType.AUTO)
	private int collegeId;
	
	
	
	
	 @NotEmpty( message="college name can not be empty")
     @Column(nullable=false)
     @Size(min=2,max=10,message="college name must be minimum 2 characters and maximum 20")
	 private String collegeName;
	 
	 
	 
	 
	 
	 
	 
	 

}

