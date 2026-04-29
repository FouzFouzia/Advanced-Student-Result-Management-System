package com.sms.model;

	import java.io.Serializable;

	public class Student implements Serializable {

	    private int rollNo;
	    private String name;
	    private int marks1;
	    private int marks2;
	    private int marks3;
	    private int total;
	    private double percentage;
	    private String grade;

	    public Student(int rollNo, String name, int marks1, int marks2, int marks3) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.marks1 = marks1;
	        this.marks2 = marks2;
	        this.marks3 = marks3;
	        calculateResult();
	    }

	    public void calculateResult() {
	        total = marks1 + marks2 + marks3;
	        percentage = total / 3.0;

	        if (percentage >= 90)
	            grade = "A+";
	        else if (percentage >= 75)
	            grade = "A";
	        else if (percentage >= 60)
	            grade = "B";
	        else if (percentage >= 40)
	            grade = "C";
	        else
	            grade = "Fail";
	    }

	    public void display() {
	        System.out.println("--------------------------------");
	        System.out.println("Roll No     : " + rollNo);
	        System.out.println("Name        : " + name);
	        System.out.println("Total       : " + total);
	        System.out.println("Percentage  : " + percentage);
	        System.out.println("Grade       : " + grade);
	        System.out.println("--------------------------------");
	    }

	    public int getRollNo() {
	        return rollNo;
	    }

	    public int getTotal() {
	        return total;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void updateMarks(int m1, int m2, int m3) {
	        this.marks1 = m1;
	        this.marks2 = m2;
	        this.marks3 = m3;
	        calculateResult();
	    }
	}


