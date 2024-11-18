package com.example.petclinicbookingappointment.model;

public class Pet {
	private Integer id;
	private String name;
	private String species;
	private String breed;
	private Integer age;
	private Integer owenerId;
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(Integer id, String name, String species, String breed, Integer age, Integer owenerId) {
		super();
		this.id = id;
		this.name = name;
		this.species = species;
		this.breed = breed;
		this.age = age;
		this.owenerId = owenerId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getOwenerId() {
		return owenerId;
	}
	public void setOwenerId(Integer owenerId) {
		this.owenerId = owenerId;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", species=" + species + ", breed=" + breed + ", age=" + age
				+ ", owenerId=" + owenerId + "]";
	}

}
