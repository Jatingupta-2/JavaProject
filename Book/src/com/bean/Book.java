package com.bean;

public class Book {
private  int id;
private String name;
private double price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Book(String name, double price) {
	super();
	this.name = name;
	this.price = price;
}

}