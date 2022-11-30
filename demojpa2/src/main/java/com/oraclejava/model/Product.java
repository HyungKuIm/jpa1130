package com.oraclejava.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product implements Serializable {
	@Id
	private String id;   // 제품 고유 id(TV-001)
	private String name; // 제품명(중소기업TV)
	private String type; // 제품 타입(Mobile, TV, Camera)
	private String description; // 제품 설명(화질이 깨끗하다)
	private String brand; //제품 브랜드(Samsung, 주연테크)
}
