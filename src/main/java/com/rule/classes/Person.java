package com.rule.classes;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String gender;
	private String firstName;
	private String lastName;
	private Integer age;
	private JobType job;
	private List<Pet> pets;
	private Integer discount;
	private List<DiscountType> discountList;
	
	public Person() {
		super();
		this.gender = "NO_GENDER";
		this.firstName = "NO_FNAME";
		this.lastName = "NO_LNAME";
		this.age = -99;
		this.job = JobType.DEVELOPER;
		this.pets = new ArrayList<Pet>();
		this.discount = 0;
		this.discountList = new ArrayList<DiscountType>();
	}
	
	public Person(String gender, String firstName, String lastName, Integer age, JobType job, List<Pet> pets) {
		super();
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.job = job;
		this.pets = pets;
		this.discount = 0;
		this.discountList = new ArrayList<DiscountType>();
	}


	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public JobType getJob() {
		return job;
	}
	public void setJob(JobType job) {
		this.job = job;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public List<DiscountType> getDiscountList() {
		return discountList;
	}
	public void setDiscountList(List<DiscountType> discountList) {
		this.discountList = discountList;
	}

	public void addPet(Pet pet) {
		if(this.getPets() != null) {
			this.getPets().add(pet);
		} else {
			System.err.println("PET ARRAY IS NULL");
		}
	}
	public void addDiscount(DiscountType discount) {
		if(this.getDiscountList() != null) {
			this.getDiscountList().add(discount);
		} else {
			System.err.println("DISCOUNT ARRAY IS NULL");
		}
	}
	public String getFullName() {
		String fullName = this.getFirstName() + " " + this.getLastName();
		return fullName;
	}
	

	@Override
	public String toString() {
		return "Person [\n\tgender=" + gender + ", \n\tfirstName=" + firstName + ", \n\tlastName=" + lastName + ", \n\tage=" + age
				+ ", \n\tjob=" + job + ", \n\tpets=" + pets + ", \n\tdiscount=" + discount + "\n]";
	}
	
}
