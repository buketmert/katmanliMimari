package dataAccess.hibernate;

import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorHibernateDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Egitmen Hibernate ile veritabanina eklendi");
    }
}
