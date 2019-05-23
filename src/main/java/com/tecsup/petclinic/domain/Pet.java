package com.tecsup.petclinic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author jgomezm
 *
 */
@Entity(name = "pets") // indica como se llama en la tabla de la BD
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@Column(name = "type_id")
	private int typeId;
	private int owner_id;

	public Pet() {
	}

	public Pet(long id, String name, int type_id, int owner_id) {
		super();
		this.id = id;
		this.name = name;
		this.typeId = type_id;
		this.owner_id = owner_id;
	}

	public Pet(String name, int type_id, int owner_id) {
		super();
		this.name = name;
		this.typeId = type_id;
		this.owner_id = owner_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType_id() {
		return typeId;
	}

	public void setType_id(int type_id) {
		this.typeId = type_id;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", type_id=" + typeId + ", owner_id=" + owner_id + "]";
	}

	
	
}
