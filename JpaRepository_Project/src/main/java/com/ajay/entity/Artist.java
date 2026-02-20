package com.ajay.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "ARTIST_INFO")
@Data 
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public final class Artist {
	@Column(name = "AID")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer aid;
	
	@Column(name = "ANAME",length=40)
	@NonNull
	private String aname;
	
	@Column(length=30)
	@NonNull
	private String category;
	
	@NonNull
	private Double fee;
	
}
