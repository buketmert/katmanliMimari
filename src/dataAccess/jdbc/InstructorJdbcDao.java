package dataAccess.jdbc;

import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorJdbcDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Egitmen JDBC ile veritabanina eklendi");
    }
}
