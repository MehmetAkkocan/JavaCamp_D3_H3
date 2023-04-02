package src.dataAccess.course;

import src.entities.Course;

public class JbdcCourseDao implements ICourseDao {

    @Override
    public void addCourse(Course course) {
       System.out.println("Jdbc ile Kurs eklendi! ->" + course.getCourseName());
    }
    
}
