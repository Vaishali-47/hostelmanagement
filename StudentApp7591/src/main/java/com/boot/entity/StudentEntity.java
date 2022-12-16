package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

public class StudentEntity {
	
	     @Id
    	@GeneratedValue(strategy=GenerationType.AUTO)
	    private int studentId;
	      
	     @NotNull( message="Student name can not be empty")
	     @Column(nullable=false)
	     @Size(min=2,max=10,message="Student name must be minimum 2 characters and maximum 10")
	     
	     private String studentName;
	     
	     @Email(message ="Email is not valid")
	     @NotEmpty(message ="Email can not be empty")
	     @Column(nullable=false)
	     private String studentEmail;
	     
	     
	     @Column(nullable=false)
	     @NotNull(message="Student age can not be empty")
	     @Min(message="Minimum age of student should be 10",value=10)
	     @Max(message="Maximum age of student should be 25",value=25)
	    private int studentAge;
	     
	     @Column(nullable=false)
	     @NotNull(message="Student password can not be empty")
	     @Size(min=2,max=10,message="Student class must be minimum 2 characters and maximum 10")
		 private String studentPassword;
	     
	    @Column(nullable=false)
	    @NotEmpty(message="Student class can not be empty")
	    @Size(min=2,max=10,message="Student class must be minimum 2 characters and maximum 10")
	    private String studentClass;
}
