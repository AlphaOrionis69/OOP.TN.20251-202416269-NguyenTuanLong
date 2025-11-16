package com.hust.kstn.parameters;

public class TestingParameters {

	public static void main(String[] args) {
		Student s1 = new Student(1, "A");
		Student s2 = new Student(2, "B");
		swap(s1, s2);
		System.out.println("First student: " + s1.getName());
		System.out.println("Second student: " + s2.getName());
	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1; o1 = o2; o2 = tmp;
	}
	public static void swap(Student o1, Student o2) {		
		String tmpName = o1.getName(); int tmpId = o1.getId();
		o1.setName(o2.getName()); o1.setId(o2.getId());
		o2.setName(tmpName); o2.setId(tmpId);
	}
}
