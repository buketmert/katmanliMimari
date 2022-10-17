package business;

import dataAccess.CourseDao;
import entities.Course;
import log.BaseLogger;

public class CourseManager {

	private CourseDao courseDao;
	private BaseLogger[] loggers;

	public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Course[] courses = { new Course(1, "Java", 2500), new Course(2, "C++", 2750) };
		for (Course c : courses) {
			if (course.getCourseName() == c.getCourseName()) {
				throw new Exception("Kurs �smi Tekrar Edemez...");
			}
		}
		if (course.getUnitPrice() < 0) {
			throw new Exception("Kursun Fiyat� 0 dan k���k olamaz...");
		} else

			courseDao.add(course);
		for (BaseLogger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

}
