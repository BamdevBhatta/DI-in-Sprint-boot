package com.demo.test;

public class Student {
private int id;
private String name;
private String faculty;
private String college;
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
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", faculty=" + faculty + ", college=" + college + "]";
}

}
