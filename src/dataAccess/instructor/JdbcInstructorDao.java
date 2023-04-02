package src.dataAccess.instructor;

import src.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen eklendi! -> " + instructor.getInstructorName());    
    }
    
}
