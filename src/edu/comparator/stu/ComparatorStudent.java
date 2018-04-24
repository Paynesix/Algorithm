package edu.comparator.stu;

import java.util.Comparator;

/**
 * comparator of Student
 * @author payne
 *
 */
public class ComparatorStudent implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id > o2.id) {
			return 1;
		}else if(o1.id < o2.id ){
			return -1;
		}
		return 0;
	}
}
