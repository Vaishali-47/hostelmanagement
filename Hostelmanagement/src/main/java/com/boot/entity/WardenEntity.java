package com.boot.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
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
@Table(name="warden_t")
public class WardenEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int wardenId;
	
	
	@NotEmpty( message="warden name can not be empty")
    @Column(nullable=false)
    @Size(min=2,max=10,message="warden name must be minimum 2 characters and maximum 10")
	private String wardenName;
	
	
	 @Email(message ="warden is not valid")
     @NotEmpty(message ="Email can not be empty")
     @Column(nullable=false)
	 private String wardenEmail;
	
	
	@NotNull(message="mobile no can not be empty")
	@Column(nullable=false)
	 @Size(min=2,max=10,message="warden number minimum 2 characters and maximum 10")
	private String wardenMobile;
	
	
	@ManyToOne
    @JoinColumn(name="hid")
    private HostelEntity hostel;
//	
//	
//	
//	 @JsonIgnore
//	 @OneToMany(cascade=CascadeType.ALL)
//	 private List<FloorEntity> floorList1=new ArrayList<>();
//	
//	
	 @JsonIgnore
	 @OneToMany(mappedBy= "warden",cascade=CascadeType.ALL)
 private List<FloorEntity> floorList1=new ArrayList<>();
	  
	

}


