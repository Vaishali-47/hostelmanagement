package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
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
@Table(name="student_t")
public class StudentEntity {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	
	

	@NotEmpty( message="student name can not be empty")
    @Column(nullable=false)
    @Size(min=2,max=10,message="student name must be minimum 2 characters and maximum 10")
	private String  studentName;
	
	 @Email(message ="Email is not valid")
     @NotEmpty(message ="Email can not be empty")
     @Column(nullable=false)
	 private String studentEmail;
	 
// @Column(nullable=false)
//	 @NotEmpty(message="Student password can not be empty")
//	 @Size(min=2,max=10,message="Student class must be minimum 2 characters and maximum 10")
//	 private String studentPassword;
	
	 

	 @NotEmpty( message="course name can not be empty")
     @Column(nullable=false)
    @Size(min=2,max=10,message="course name must be minimum 2 characters and maximum 10") 
	 private String courseName;
	
	 
	 @NotEmpty(message="mobile no can not be empty")
	 @Column(nullable=false)
	 @Size(min=1,max=10,message="mobile no must be 10 digit")
	 private String studentMobile;
	 
	 
	 @ManyToOne
     @JoinColumn(name="hid")
     private HostelEntity hostel;
 
	// @NotEmpty(message="hostelAvailed can not be empty")
	 private boolean isHostelAvailed=false;
	 
	 
	 
	
	 
	 
	 
	 
//	 @OneToOne(mappedBy = "studentEntity")
	
//	 @JsonIgnore
	 //private  AllocatedRoomEntity allocatedRoom;
	 

	
	 

}

