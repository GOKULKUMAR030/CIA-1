package com.example.demo;

public class FamilyDetails
{
	 private int Age;
	 private String Name;
     private String Relation;
	public FamilyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FamilyDetails(String name, int age, String relation) {
		super();
		Name = name;
		Age = age;
		Relation = relation;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age)
	{
		Age = age;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public String getRelation() {
		return Relation;
	}
	public void setRelation(String relation) {
		Relation = relation;
	}
	
	
   
}
