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
@Table(name="room_t")
public class RoomEntity {
	
	
	@Id
	@GeneratedValue
	private int roomId;
	
	
	@NotEmpty( message="room type can not be empty")
    @Column(nullable=false)
    @Size(min=2,max=10,message="room type must be minimum 2 characters and maximum 10")
	private String roomType;
	
    @Column(nullable=false)
    @NotNull(message="room fee can not be empty")
    //@Size(min=2000,max=10000,message="room type must be minimum 2000 characters and maximum 10000")
	private String roomFee;
    
    
    @Column(nullable=false)
    private boolean roomStatus;
    
    
    @Column(nullable=false)
    private int roomCapacity;
    
    @Column(nullable=false)
    private int availableSeat;
	
    @ManyToOne
    @JoinColumn(name="fid")
    private FloorEntity floor;
	
   
    
    @JsonIgnore
	 @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)  
    private List<AllocatedRoomEntity> allocatedroomList=new ArrayList<>();
	 
	 

}

