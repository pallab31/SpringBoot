package com.paul.springweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Student_Info")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int age;
	
	@OneToOne
	private Address parmanentAddress;
	
	@OneToOne
	private Address PresentAddress;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getParmanentAddress() {
		return parmanentAddress;
	}
	public void setParmanentAddress(Address parmanentAddress) {
		this.parmanentAddress = parmanentAddress;
	}
	public Address getPresentAddress() {
		return PresentAddress;
	}
	public void setPresentAddress(Address presentAddress) {
		PresentAddress = presentAddress;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", parmanentAddress=" + parmanentAddress
				+ ", PresentAddress=" + PresentAddress + "]";
	}
	
	
	
}
