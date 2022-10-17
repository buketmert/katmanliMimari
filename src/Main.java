import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.hibernate.CategoryHibernateDao;
import dataAccess.hibernate.CourseHibernateDao;
import dataAccess.hibernate.InstructorHibernateDao;
import dataAccess.jdbc.CategoryJdbcDao;
import dataAccess.jdbc.InstructorJdbcDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import log.BaseLogger;
import log.DatabaseLogger;
import log.EmailLogger;
import log.FileLogger;

public class Main {

    public static void main(String[] args) throws Exception{
        
        Category category = new Category(1, "Machine language");
		Course course = new Course(10, "C#", 3500);
		Instructor instructor = new Instructor(2, "Buket", "Mert");

		 BaseLogger[] loggers = {new DatabaseLogger(),new FileLogger() , new EmailLogger()};
	     
		     CategoryManager categoryManager = new CategoryManager(new CategoryJdbcDao(), loggers);
		     categoryManager.add(category);
		     
		     System.out.println(" ");
		     System.out.println("<<<<<>>>>>");
		     System.out.println(" ");
		     
		     CourseManager courseManager = new CourseManager(new CourseHibernateDao(), loggers);
		     courseManager.add(course);
		     
		     System.out.println(" ");
		     System.out.println("<<<<<>>>>>");
		     System.out.println(" ");
		     
		     InstructorManager instructorManager = new InstructorManager(new InstructorJdbcDao(), loggers);
		     instructorManager.add(instructor);




    }
}
