package com.rule.classes;

public class Pet {
	private PetType species;
	private String name;
	private Integer age;
	private Person owner;
	
	public Pet(PetType species, String name, Integer age, Person owner) {
		super();
		this.species = species;
		this.name = name;
		this.age = age;
		this.owner = owner;
	}

	public PetType getSpecies() {
		return species;
	}
	public void setSpecies(PetType species) {
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Pet [species=" + species + ", name=" + name + ", age=" + age + ", owner=" + owner.getFirstName() + " " + owner.getLastName() + "]";
	}
	
	
}
