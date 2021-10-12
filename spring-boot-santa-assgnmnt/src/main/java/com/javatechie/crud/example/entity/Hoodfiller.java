package com.javatechie.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HOOD_FILLER")
public class Hoodfiller {

    public int getHood_capacity() {
		return hood_capacity;
	}
	public void setHood_capacity(int hood_capacity) {
		this.hood_capacity = hood_capacity;
	}
	public double getPresent_weights() {
		return present_weights;
	}
	public void setPresent_weights(double present_weights) {
		this.present_weights = present_weights;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Id
    @GeneratedValue
    private int id;
    private int hood_capacity;
    private double present_weights;
    private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
