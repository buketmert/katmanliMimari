package dataAccess.jdbc;

import dataAccess.CourseDao;
import entities.Course;

public class CourseJdbcDao implements CourseDao {
	public void add(Course course) {
		System.out.println("Kurs JDBC ile veritabanina eklendi");
	}
}
