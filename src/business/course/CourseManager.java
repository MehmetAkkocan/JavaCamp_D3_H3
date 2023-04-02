package src.business.course;

import java.util.ArrayList;
import java.util.List;

import src.core.logging.ILogger;
import src.dataAccess.course.ICourseDao;
import src.entities.Course;

public class CourseManager implements ICourseManager {
    private ICourseDao courseDao;
    private ILogger[] loggers;
    public static List<String> courseList = new ArrayList<>();

    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    @Override
    public void addCourse(Course course) throws Exception{
        for (String element : courseList) {
            if (course.getCourseName()==element) {
                throw new Exception("Kurs ismi tekrar edemez!");
            }
        }
        if (course.getPrice()<0) {
            throw new Exception("Kurs fiyatı 0 dan küçük olamaz");            
        }
        courseList.add(course.getCourseName());
        courseDao.addCourse(course);
        for (ILogger logger : loggers) {
            logger.log(course.getCourseName());
        }
       
    }
  
}
