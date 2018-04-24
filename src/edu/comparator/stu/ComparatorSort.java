package edu.comparator.stu;

import java.util.Arrays;

public class ComparatorSort {

	public static void main(String[] args) {
		Student s1 = new Student(11, 21, "payne");
		Student s2 = new Student(2, 25, "Lee");
		Student s3 = new Student(3, 23, "Alen");
		Student[] a = new Student[] {s1, s2, s3};
		Arrays.sort(a, new ComparatorStudent());
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].id);
		}
	}
}
