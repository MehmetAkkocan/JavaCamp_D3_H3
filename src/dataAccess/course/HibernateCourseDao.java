package src.dataAccess.course;

import src.entities.Course;

public class HibernateCourseDao implements ICourseDao {

    @Override
    public void addCourse(Course course) {
        System.out.println("Hibernate ile kurs eklendi! ->"+course.getCourseName());    
    }
    
}
