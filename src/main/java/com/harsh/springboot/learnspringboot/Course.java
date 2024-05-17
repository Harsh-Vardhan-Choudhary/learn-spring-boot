package com.harsh.springboot.learnspringboot;

public class Course {
	private long id;
	private String name;
	private String author;

    //constructor
    //getters
    //to string

    /*whenever we print object of the quotes class, the two string method is called 
    and all the details would be printed and these getter methods would be helping us to 
    retrieve the values of a course whenever we need them */
    
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}