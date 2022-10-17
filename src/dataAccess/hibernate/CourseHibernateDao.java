package dataAccess.hibernate;

import dataAccess.CourseDao;
import entities.Course;

public class CourseHibernateDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate ile veritabanina eklendi");
    }
}
