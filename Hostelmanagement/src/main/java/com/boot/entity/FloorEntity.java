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
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="floor_t")
public class FloorEntity {
	
	 @Id
	 @GeneratedValue
	 private int floorId;
	
	 @NotNull(message=" no_of_room can not be empty")
	 @Column(nullable=false)
	 private int no_of_Room;
    
    
	 @NotNull(message=" no_of_floor  can not be empty")
	 @Column(nullable=false)
     private int no_of_floor;
	 
	 
	 @ManyToOne
     @JoinColumn(name="hid")
     private HostelEntity hostel;

    
	
	 @ManyToOne
	 @JoinColumn(name="wid")
	 private WardenEntity warden;
	 
	 @JsonIgnore
	 @OneToMany(mappedBy="floor",cascade=CascadeType.ALL)
	 private List<RoomEntity> roomList=new ArrayList<>();
	 
}

