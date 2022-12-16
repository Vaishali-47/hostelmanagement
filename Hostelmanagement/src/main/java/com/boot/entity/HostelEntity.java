package com.boot.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name="hostel_t")
public class HostelEntity {
	
	
	@Id
	@GeneratedValue
	 private int hostelId;
	
	
	 @NotEmpty( message="hostel name can not be empty")
     @Column(nullable=false)
     @Size(min=2,max=10,message="hostel name must be minimum 2 characters and maximum 10")
	 private String hostelName;
	
	 
	 @Column(nullable=false)
     @NotNull(message="hostel fee can not be empty")
	 @Min(message="hostel fee should be mininum 2000", value=2000)
	 @Max(message="hostel fee should be maximum 10000", value=10000)
	 private String hostelFee;
	
	 
	 @NotEmpty(message="hostel type can not be empty")
	 @Column(nullable=false)
	 @Size(min=2,max=10,message="hostel type must be minimum 2 character and maximum 10")
	 private String hostelType;
	 
	 
	 @ManyToOne
     @JoinColumn(name="cid")
     private CollegeEntity college;
	 

	 
	 @JsonIgnore
	 @OneToMany(mappedBy= "hostel",cascade=CascadeType.ALL)
	 private List<StudentEntity> studentList=new ArrayList<>();
	 
	 @JsonIgnore
	 @OneToMany(mappedBy= "hostel",cascade=CascadeType.ALL)
	 private List<WardenEntity> wardenList=new ArrayList<>();
	 
	 
	 @JsonIgnore
	 @OneToMany(mappedBy= "hostel",cascade=CascadeType.ALL)
 private List<FloorEntity> floorList=new ArrayList<>();
	 
	
	                 
	         

}

