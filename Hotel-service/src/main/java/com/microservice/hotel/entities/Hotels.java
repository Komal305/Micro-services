package com.microservice.hotel.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotels {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		private String name;
		private String address;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Hotels() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Hotels(int id, String name, String address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
		}
		
}