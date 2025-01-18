package com.example.samuraitravel.entity;
 
 import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
 
 @Entity
 @Table(name = "reviews")
 @Data
 public class Review {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	 private Integer id;
     
	 @ManyToOne
	 @Column(name = "house_id")
	 private String houseId;
	 
	 @ManyToOne
	 @Column(name = "user_id")
	 private String userId;
	 
	 @Column(name = "content")
	 private String content;
	 
	 @Column(name = "score")
	 private Integer score;	
 }
